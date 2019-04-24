public final class android.support.v4.view.f {
  static final android.support.v4.view.f$b a;

  static {};
    Code:
       0: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     21
       8: new           #6                  // class android/support/v4/view/f$a
      11: dup
      12: invokespecial #25                 // Method android/support/v4/view/f$a."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #27                 // Field a:Landroid/support/v4/view/f$b;
      20: return
      21: new           #9                  // class android/support/v4/view/f$b
      24: dup
      25: invokespecial #28                 // Method android/support/v4/view/f$b."<init>":()V
      28: astore_0
      29: goto          16

  static void a(android.view.LayoutInflater, android.view.LayoutInflater$Factory2);
    Code:
       0: getstatic     #36                 // Field c:Z
       3: ifne          74
       6: ldc           #38                 // class android/view/LayoutInflater
       8: ldc           #40                 // String mFactory2
      10: invokevirtual #46                 // Method java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
      13: putstatic     #48                 // Field b:Ljava/lang/reflect/Field;
      16: getstatic     #48                 // Field b:Ljava/lang/reflect/Field;
      19: iconst_1
      20: invokevirtual #54                 // Method java/lang/reflect/Field.setAccessible:(Z)V
      23: goto          70
      26: astore_2
      27: new           #56                 // class java/lang/StringBuilder
      30: dup
      31: invokespecial #57                 // Method java/lang/StringBuilder."<init>":()V
      34: astore_3
      35: aload_3
      36: ldc           #59                 // String forceSetFactory2 Could not find field 'mFactory2' on class
      38: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      41: pop
      42: aload_3
      43: ldc           #38                 // class android/view/LayoutInflater
      45: invokevirtual #67                 // Method java/lang/Class.getName:()Ljava/lang/String;
      48: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      51: pop
      52: aload_3
      53: ldc           #69                 // String ; inflation may have unexpected results.
      55: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      58: pop
      59: ldc           #71                 // String LayoutInflaterCompatHC
      61: aload_3
      62: invokevirtual #74                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      65: aload_2
      66: invokestatic  #80                 // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      69: pop
      70: iconst_1
      71: putstatic     #36                 // Field c:Z
      74: getstatic     #48                 // Field b:Ljava/lang/reflect/Field;
      77: ifnull        129
      80: getstatic     #48                 // Field b:Ljava/lang/reflect/Field;
      83: aload_0
      84: aload_1
      85: invokevirtual #84                 // Method java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
      88: return
      89: astore_1
      90: new           #56                 // class java/lang/StringBuilder
      93: dup
      94: invokespecial #57                 // Method java/lang/StringBuilder."<init>":()V
      97: astore_2
      98: aload_2
      99: ldc           #86                 // String forceSetFactory2 could not set the Factory2 on LayoutInflater
     101: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     104: pop
     105: aload_2
     106: aload_0
     107: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     110: pop
     111: aload_2
     112: ldc           #69                 // String ; inflation may have unexpected results.
     114: invokevirtual #63                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     117: pop
     118: ldc           #71                 // String LayoutInflaterCompatHC
     120: aload_2
     121: invokevirtual #74                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     124: aload_1
     125: invokestatic  #80                 // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
     128: pop
     129: return
    Exception table:
       from    to  target type
           6    23    26   Class java/lang/NoSuchFieldException
          80    88    89   Class java/lang/IllegalAccessException

  public static void b(android.view.LayoutInflater, android.view.LayoutInflater$Factory2);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/view/f$b;
       3: aload_0
       4: aload_1
       5: invokevirtual #91                 // Method android/support/v4/view/f$b.a:(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V
       8: return
}
