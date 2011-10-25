java -Dfile.encoding=UTF8 -Xmx512M -Xss2M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -jar `dirname $0`/sbt-launch.jar "$@"
