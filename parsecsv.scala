import java.io._
import scala.io.Source

val src = Source.fromFile(new File("devnology_network.csv"))
for (line <- src.getLines){

    // println(line)

}