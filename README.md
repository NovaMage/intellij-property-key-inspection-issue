# Minimal reproducible example for Intellij Idea issue [SCL-22399](https://youtrack.jetbrains.com/issue/SCL-22399/Inspection-Scala-Properties-files-Invalid-property-key-does-not-work-with-infix-notation)

Intellij org.jetbrains.annotations.PropertyKey annotation issue when using infix notation in Scala

This project uses sbt version 1.9.9, Scala 2.13.13 and org.jetbrains.annotations 24.1.0

Should open using Intellij Idea with the Scala plugin to notice the failure in highlighting

![Intellij Idea highlighting issue](https://youtrack.jetbrains.com/api/files/74-2280180?sign=MTcxMjk2NjQwMDAwMHwxMS0xNDU5MjEzfDc0LTIyODAxODB8TnpHem5CSExnbEhGNWR0NlVWVW9KUkNhU0U4VlJSOU8tTTFraEpyUV9MMA0K&updated=1712778157289)

### Explain how the above behavior isn't what you expected

Looking at the screenshot above, you can see how calling the same function with non-infix notation triggers the inspection (marked in red, since the "invalid_key" string is not a valid property key of the "messages" bundle. However, when called with infix notation (translator translate "invalid_key"), it receives the string without warning, and smart completion does not work, nor "go to definition", nor does it mark the function call as a usage of the key in the bundle. All the goodies associated by annotating the string as an org.jetbrains.annotation.PropertyKey are essentially gone if the method is called with infix notation.

.idea folder included according to the default .gitignore file for Intellij Idea projects located
in idea/.gitignore

sbt artifacts are ignored in the top level .gitignore file