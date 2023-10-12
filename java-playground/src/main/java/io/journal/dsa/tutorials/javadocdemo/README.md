
## Writing java doc

JavaDoc tags
### "Generate Java Documentation using "Tools" -> "Generate JavaDoc." option

| Class      | Method         | Others      |
|------------|----------------|-------------|
| @author    | @param         | @link       |
| @version   | @return        | @value      |
| @since     | @throws        | @serial     |
| @see       | @exception     |             |
|            | @deprecated    |             |
|            | @code          |             |


you are give class called Book.
```java
package io.journal.dsa.tutorials.javadocdemo;

public class Book {

    static int val = 10;
    String name;

    public Book(String s) {
    }
    
    public void issue(int roll) throws Exception {

    }
    
    public boolean available(String str) {
        return true;
    }

    public String getName(int id) {
        return "java playground";
    }
}
```

To create Javadoc documentation, begin by using the `/**` comment format with two asterisks, and similarly conclude your comments with the same format.
e.g.
```java
/** @author Aniket Kakde
 * @version 1.0
 * @since 2021
**/
package io.journal.dsa.tutorials.javadocdemo;
```
Similarly you can do it for the rest of the code.

Like given in Book.java.([Book.java](java/io/journal/dsa/tutorials/javadocdemo/Book.java))

##### Next, select the Generate Java Documentation under "Tools" -> "Generate Javadoc..."






