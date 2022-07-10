
// Compare the Java and Scala programming languages.
// •	Use the following declaration and initialization to convert them to acceptable Scala statements. 

// int a = 2, b = 3, c = 4, d = 5;
// float k = 4.3f;

// and evaluate the following expressions

// a) println( - -b * a + c *d - -);
// b) println(a++);
// c) println (–2 * ( g – k ) +c);
// d) println (c=c++);
// e) println (c=++c*a++);

object ScalaLab1_Question2{
     def main(args: Array[String]){  

        var a = 1; var b = 2; var c = 4; var d = 5;
        var f = 4.3f;
        var k = 5.3f;
        // println( --b * a + c *d--);
        // println(a++);
        println (-2 * ( f - k ) +c);
        // println (c=c++);
        // println (c=++c*a++);

        //these commented out statements are not working in scala unlike c++ 


    }
}