import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.implicits._
import org.http4s.server.Router
import org.http4s.blaze.server.BlazeServerBuilder

import scala.concurrent.ExecutionContext
import com.example.lesson18capostone.Time.TimeApi

object TimeApp extends IOApp {
  private val httpApp = Router (
    "/" -> new TimeApi().routes
  ).orNotFound

  private def stream(args: List[String]) =
    BlazeServerBuilder[IO](ExecutionContext.global)
      .bindHttp(8000, "0.0.0.0")
      .withHttpApp(httpApp)
      .serve

  override def run(args: List[String]): IO[ExitCode] =
    stream(args).compile.drain.as(ExitCode.Success)

}
