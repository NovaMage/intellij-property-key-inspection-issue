import org.jetbrains.annotations.PropertyKey

class Translator {
  def translate(@PropertyKey(resourceBundle = "messages") key: String): String = {
    key + " translated"
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val translator = new Translator()
    // Using infix notation, the inspection doesn't work
    // and strings are not highlighted as invalid keys
    translator translate "invalid_key"
    translator translate "valid_key"

    // Same code, using non-infix notation, the inspection works
    // as well as smart completion, usage search, etc.
    translator.translate("invalid_key")
    translator.translate("valid_key")
  }
}