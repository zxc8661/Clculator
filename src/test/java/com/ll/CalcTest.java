package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CalcTest {
    Calculator Cals = new Calculator();
    @Test
    @DisplayName("3 + 5")
    public void t1() {
        Calculator Calc = new Calculator();
//        void rs = Calc.run("3 + 5");
//        assertThat(rs).isEqualTo(8);
    }

    @Test
    @DisplayName("후위표기식 ")
    public void test2(){
        String rs = Cals.run("3+5");
        assertThat(rs).isEqualTo("3 5 +");
    }
    @Test
    @DisplayName("후위표기식 ")
    public void test3(){
        String rs = Cals.run("-3+2/(4*2)-2");
        assertThat(rs).isEqualTo("3 5 +");
    }


}
