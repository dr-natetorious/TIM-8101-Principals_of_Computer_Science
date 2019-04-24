class a.c.d extends a.c.c {
  public static final float a(float, float, float);
    Code:
       0: fload_1
       1: fload_2
       2: fcmpl
       3: ifle          62
       6: new           #8                  // class java/lang/StringBuilder
       9: dup
      10: invokespecial #12                 // Method java/lang/StringBuilder."<init>":()V
      13: astore_3
      14: aload_3
      15: ldc           #14                 // String Cannot coerce value to an empty range: maximum
      17: invokevirtual #18                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      20: pop
      21: aload_3
      22: fload_2
      23: invokevirtual #21                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
      26: pop
      27: aload_3
      28: ldc           #23                 // String  is less than minimum
      30: invokevirtual #18                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_3
      35: fload_1
      36: invokevirtual #21                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
      39: pop
      40: aload_3
      41: bipush        46
      43: invokevirtual #26                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      46: pop
      47: new           #28                 // class java/lang/IllegalArgumentException
      50: dup
      51: aload_3
      52: invokevirtual #32                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      55: invokespecial #35                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      58: checkcast     #37                 // class java/lang/Throwable
      61: athrow
      62: fload_0
      63: fload_1
      64: fcmpg
      65: ifge          70
      68: fload_1
      69: freturn
      70: fload_0
      71: fload_2
      72: fcmpl
      73: ifle          78
      76: fload_2
      77: freturn
      78: fload_0
      79: freturn
}
