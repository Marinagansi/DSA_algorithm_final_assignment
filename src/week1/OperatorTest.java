package week1;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;



class OperatorTest {



@Test
void test1() {
Operator exp = new Operator(15,new int[]{3,4,3});
assertEquals(exp.output,"3+4*3 3*4+3 ");

}
@Test
void test2() {
Operator exp = new Operator(6,new int[]{1,2,3});
assertEquals(exp.output,"1+2+3 1*2*3 ");

}
@Test
void test3() {
Operator exp = new Operator(20,new int[]{7,2});
assertEquals(exp.output,"There cannot be any combination of +,-,* with input array : [7, 2] to reach target : 20");

}



}
