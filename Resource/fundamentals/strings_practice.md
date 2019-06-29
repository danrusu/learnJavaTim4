### Strings practice

#### Useful methods from API
```java
char charAt(int index)
int compareTo(String other)
boolean endsWith(String suﬀix)
booleanequals(Object other)
booleanequalsIgnoreCase(String other)
int indexOf(String str)
int lastIndexOf(String str)
int length()
String replace(CharSequenceoldString,  CharSequencenewString) •
booleanstartsWith(String prefix)
String substring(int beginIndex)
String toLowerCase()
String toUpperCase()
String trim()
```


#### Task

1. Create variable of type String.
Initialize it with value
„Lorem ipsum dolor sit amet, consectetur adipiscing elit”.
```
a) Convert it to lower case.

b) Convert it to upper case.

c) Replace „o” with „z”.

d) Check if your variable ends with „elit”.
```

2. Write in a comment on each line
that prints to console what result you expect.
Launch it and verify the results.
```
String a = "abc";
String b = "abc";
String c = new String("abc");

System.out.println(a == b);

System.out.println(a.equals(b));

System.out.println(b == c);

System.out.println(b.equals(c));
```

