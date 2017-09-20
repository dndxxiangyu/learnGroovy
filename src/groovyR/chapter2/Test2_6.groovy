package groovyR.chapter2

//可以通过asType来为接口创建一个实例。
//handle.asType(Class.forName("java.awt.event.${input}"));
class Test2_6 {
    public static void main(String[] args) {
        ButtonJava buttonJava = new ButtonJava()
//        buttonJava.addActionListener(new ButtonJava.ActionListener() {
//            @Override
//            void actionPerformed() {
//                println "click button"
//            }
//        })

        //groovy
        buttonJava.addActionListener(
                { println "$it click button" } as ButtonJava.ActionListener
        )

        //方法名作为key
        buttonJava.addActionListener(
                [
                        click: {println "click button"},
                        longClick: {println "long click button"}
                ] as ButtonJava.ActionListener
        )
        buttonJava.longClick("wxy1")
        buttonJava.click("wxy2")
    }
}

class ButtonJava {
    public void addActionListener(ActionListener listener) {
        this.listener = listener;
    }
    private ActionListener listener;
    public interface ActionListener {
        void click(String who);

        void longClick(String who)

    }
    public void click(String whoClick) {
        listener?.click(whoClick);
    }

    public void longClick(String who) {
        listener?.longClick(who)
    }
}
