#if ((${PACKAGE_NAME} && ${PACKAGE_NAME} != ""))package ${PACKAGE_NAME} #end
#parse("File Header.java")

import play.api.libs.json.{Format, Json}

case class ${NAME}()
object ${NAME} {
    implicit val format: Format[${NAME}] = Json.format[${NAME}]
}
