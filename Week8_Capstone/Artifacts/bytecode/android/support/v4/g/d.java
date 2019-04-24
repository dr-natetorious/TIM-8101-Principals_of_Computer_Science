public class android.support.v4.g.d {
  public static void a(java.lang.Object, java.lang.StringBuilder);
    Code:
       0: aload_0
       1: ifnonnull     14
       4: ldc           #8                  // String null
       6: astore_0
       7: aload_1
       8: aload_0
       9: invokevirtual #14                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      12: pop
      13: return
      14: aload_0
      15: invokevirtual #18                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      18: invokevirtual #24                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      21: astore        4
      23: aload         4
      25: ifnull        39
      28: aload         4
      30: astore_3
      31: aload         4
      33: invokevirtual #30                 // Method java/lang/String.length:()I
      36: ifgt          72
      39: aload_0
      40: invokevirtual #18                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      43: invokevirtual #33                 // Method java/lang/Class.getName:()Ljava/lang/String;
      46: astore        4
      48: aload         4
      50: bipush        46
      52: invokevirtual #37                 // Method java/lang/String.lastIndexOf:(I)I
      55: istore_2
      56: aload         4
      58: astore_3
      59: iload_2
      60: ifle          72
      63: aload         4
      65: iload_2
      66: iconst_1
      67: iadd
      68: invokevirtual #41                 // Method java/lang/String.substring:(I)Ljava/lang/String;
      71: astore_3
      72: aload_1
      73: aload_3
      74: invokevirtual #14                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      77: pop
      78: aload_1
      79: bipush        123
      81: invokevirtual #44                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      84: pop
      85: aload_0
      86: invokestatic  #50                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      89: invokestatic  #55                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      92: astore_0
      93: goto          7
}
