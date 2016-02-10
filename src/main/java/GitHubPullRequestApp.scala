import net.caoticode.buhtig.Buhtig

/**
 * Created by cameron on 09/02/16.
 */
object GitHubPullRequestApp {
  def main(args:Array[String]) {
    val buhtig = new Buhtig("b42382f39f2debc07cd60432529fc05cf94e1b78")
    val client = buhtig.syncClient
  }
}
