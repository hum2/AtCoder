package Practice1

/**
  *
  *
  * @see http://abc001.contest.atcoder.jp/tasks/abc001_3
  *      Created by shuhei on 2016/04/10.
  */
object Main3 extends App {
  val Array(deg, dis) = scala.io.StdIn.readLine.split(" ")

  // set direction
  var dir = deg.toDouble / 10 match {
    case d if d >= 11.25 && d < 33.75 => "NNE"
    case d if d >= 33.75 && d < 56.25 => "NE"
    case d if d >= 56.25 && d < 78.75 => "ENE"

    case d if d >= 78.75 && d < 101.25 => "E"
    case d if d >= 101.25 && d < 123.75 => "ESE"
    case d if d >= 123.75 && d < 146.25 => "SE"
    case d if d >= 146.25 && d < 168.75 => "SSE"

    case d if d >= 168.75 && d < 191.25 => "S"
    case d if d >= 191.25 && d < 213.75 => "SSW"
    case d if d >= 213.75 && d < 236.25 => "SW"
    case d if d >= 236.25 && d < 258.75 => "WSW"

    case d if d >= 258.75 && d < 281.25 => "W"
    case d if d >= 281.25 && d < 303.75 => "WNW"
    case d if d >= 303.75 && d < 326.25 => "NW"
    case d if d >= 326.25 && d < 348.75 => "NNW"
    case _ => "N"
  }

  // set wild speed
  var ws = math.floor(dis.toDouble / 60 * 10 + 0.5) / 10 match {
    case d if d <= 0.2 => 0
    case d if d >= 0.3 && d <= 1.5 => 1
    case d if d >= 1.6 && d <= 3.3 => 2
    case d if d >= 3.4 && d <= 5.4 => 3
    case d if d >= 5.5 && d <= 7.9 => 4
    case d if d >= 8.0 && d <= 10.7 => 5
    case d if d >= 10.8 && d <= 13.8 => 6
    case d if d >= 13.9 && d <= 17.1 => 7
    case d if d >= 17.2 && d <= 20.7 => 8
    case d if d >= 20.8 && d <= 24.4 => 9
    case d if d >= 24.5 && d <= 28.4 => 10
    case d if d >= 28.5 && d <= 32.6 => 11
    case _ => 12
  }
  if (ws == 0) {
    dir = "c"
  }
  println(dir + " " + ws)
}
