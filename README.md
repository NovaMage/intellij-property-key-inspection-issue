# Minimal reproducible example for Intellij Idea issue [SCL-24824](https://youtrack.jetbrains.com/issue/SCL-24824/org.jetbrains.PropertyKey-smart-completion-and-find-usages-does-not-work-with-infix-notation)

Intellij org.jetbrains.annotations.PropertyKey annotation issue when using infix notation in Scala

This project uses sbt version 1.9.9, Scala 3.7.4 and org.jetbrains.annotations 26.0.2-1

Should open using Intellij Idea with the Scala plugin and try out find usages or smart completion of keys to see the problem.

![Intellij Idea highlighting issue](https://youtrack.jetbrains.com/api/files/74-3137288?sign=MTc2Njk2NjQwMDAwMHwxMS0xNDU5MjEzfDc0LTMxMzcyODh8Y01PS25seEQ4NzBFRzFMX0VVaUN4ak81ZDlyZjdSOWR0dU1nV0lOSTNCTQ0K&updated=1766757357963)

### Explain how the above behavior isn't what you expected

Looking at the screenshot above, you can see how smart completion and find usages work properly on CTRL+B for non-infix notation.
However, when using infix notation, both features fail to work as expected, as shown below.

![Intellij Idea highlighting issue](https://youtrack.jetbrains.com/api/files/107-3365743?sign=MTc2Njk2NjQwMDAwMHwxMS0xNDU5MjEzfDEwNy0zMzY1NzQzfE9ZREtSRk5ZSDhYMFlLOFVaN3B0WWF3dnA5ZVlYaVVwS3lfM1dRMzI0VGcNCg)

.idea folder included according to the default .gitignore file for Intellij Idea projects located
in idea/.gitignore

sbt artifacts are ignored in the top level .gitignore file