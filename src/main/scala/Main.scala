import org.jetbrains.annotations.PropertyKey

class Translator {
  def translate(@PropertyKey(resourceBundle = "messages") key: String): String = {
    key + " translated"
  }
}

object Main {

  def main(args: Array[String]): Unit = {
    val translator = new Translator()
    // Using infix notation, smart completion and usage search do not work (try CTRL+B or ALT+F7 on the key)
    // Also, pressing ALT+F7 on the messages resource bundle key does not find this usage.
    translator translate "valid_key"

    // Same code, using non-infix notation, smart completion & usage search work.
    translator.translate("valid_key")


    //Invalid keys highlighting works properly regardless of the notation used
    translator translate "invalid_key"
    translator.translate("invalid_key")
  }

}