package Practice1

/**
  * @see http://abc001.contest.atcoder.jp/tasks/abc001_2
  * Created by shuhei on 2016/04/10.
  */
object Main2 extends App {
  var m = readInt
  var r = 0
  if (m >= 100 && m <= 5000) {
    r = m / 100
  } else if (m >= 6000  && m <= 30000) {
    r = m / 1000 + 50
  } else if (m >= 35000 && m <= 70000) {
    r = (m / 1000 - 30) / 5 + 80
  } else if (m >= 70000) {
    r = 89
  }
  if (r < 10) {
    print(0)
  }
  println(r)
}
