package groovyR.chapter2

//groovy与系统进程交互，查看svn的help功能
//println "svn help".execute().getText()
//Cannot run program "groovy": CreateProcess error=2, 系统找不到指定的文件。 windows下的问题
//cmd /c groovy -v:执行完命令后关闭窗口
println "cmd /c groovy -v".execute().text