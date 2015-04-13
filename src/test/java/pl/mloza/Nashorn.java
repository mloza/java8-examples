package pl.mloza;

import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Nashorn {
    @Test
    public void testNashorn() throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        System.out.println(engine.getClass().getName());
        System.out.println("Result:" + engine.eval("function f() { return 63; }; f() + 1;"));
    }
}
