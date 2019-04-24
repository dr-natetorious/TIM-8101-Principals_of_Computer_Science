class com.b.a.j implements com.b.a.l {
  com.b.a.j();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #18                 // class java/lang/ThreadLocal
       8: dup
       9: invokespecial #19                 // Method java/lang/ThreadLocal."<init>":()V
      12: putfield      #21                 // Field a:Ljava/lang/ThreadLocal;
      15: aload_0
      16: new           #23                 // class java/util/ArrayList
      19: dup
      20: invokespecial #24                 // Method java/util/ArrayList."<init>":()V
      23: putfield      #26                 // Field b:Ljava/util/List;
      26: return

  public void a(int, java.lang.String, java.lang.String, java.lang.Throwable);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_3
       3: astore        5
       5: aload         4
       7: ifnull        62
      10: aload_3
      11: astore        5
      13: aload_3
      14: ifnull        62
      17: new           #52                 // class java/lang/StringBuilder
      20: dup
      21: invokespecial #53                 // Method java/lang/StringBuilder."<init>":()V
      24: astore        5
      26: aload         5
      28: aload_3
      29: invokevirtual #57                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      32: pop
      33: aload         5
      35: ldc           #59                 // String  :
      37: invokevirtual #57                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      40: pop
      41: aload         5
      43: aload         4
      45: invokestatic  #64                 // Method com/b/a/m.a:(Ljava/lang/Throwable;)Ljava/lang/String;
      48: invokevirtual #57                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      51: pop
      52: aload         5
      54: invokevirtual #67                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      57: astore        5
      59: goto          62
      62: aload         5
      64: astore_3
      65: aload         4
      67: ifnull        84
      70: aload         5
      72: astore_3
      73: aload         5
      75: ifnonnull     84
      78: aload         4
      80: invokestatic  #64                 // Method com/b/a/m.a:(Ljava/lang/Throwable;)Ljava/lang/String;
      83: astore_3
      84: aload_3
      85: astore        4
      87: aload_3
      88: invokestatic  #70                 // Method com/b/a/m.a:(Ljava/lang/CharSequence;)Z
      91: ifeq          98
      94: ldc           #72                 // String Empty/NULL log message
      96: astore        4
      98: aload_0
      99: getfield      #26                 // Field b:Ljava/util/List;
     102: invokeinterface #78,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     107: astore_3
     108: aload_3
     109: invokeinterface #84,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     114: ifeq          154
     117: aload_3
     118: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     123: checkcast     #89                 // class com/b/a/f
     126: astore        5
     128: aload         5
     130: iload_1
     131: aload_2
     132: invokeinterface #92,  3           // InterfaceMethod com/b/a/f.a:(ILjava/lang/String;)Z
     137: ifeq          108
     140: aload         5
     142: iload_1
     143: aload_2
     144: aload         4
     146: invokeinterface #95,  4           // InterfaceMethod com/b/a/f.a:(ILjava/lang/String;Ljava/lang/String;)V
     151: goto          108
     154: aload_0
     155: monitorexit
     156: return
     157: aload_0
     158: monitorexit
     159: aload_2
     160: athrow
     161: astore_2
     162: goto          157
    Exception table:
       from    to  target type
          17    59   161   any
          78    84   161   any
          87    94   161   any
          98   108   161   any
         108   151   161   any

  public void a(com.b.a.f);
    Code:
       0: aload_0
       1: getfield      #26                 // Field b:Ljava/util/List;
       4: aload_1
       5: invokeinterface #100,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      10: pop
      11: return

  public void a(java.lang.Object);
    Code:
       0: aload_0
       1: iconst_3
       2: aconst_null
       3: aload_1
       4: invokestatic  #104                // Method com/b/a/m.a:(Ljava/lang/Object;)Ljava/lang/String;
       7: iconst_0
       8: anewarray     #4                  // class java/lang/Object
      11: invokespecial #106                // Method a:(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      14: return

  public void a(java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: iconst_3
       2: aconst_null
       3: aload_1
       4: aload_2
       5: invokespecial #106                // Method a:(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
       8: return

  public void a(java.lang.Throwable, java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: bipush        6
       3: aload_1
       4: aload_2
       5: aload_3
       6: invokespecial #106                // Method a:(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
       9: return

  public void b(java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: iconst_5
       2: aconst_null
       3: aload_1
       4: aload_2
       5: invokespecial #106                // Method a:(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
       8: return

  public void c(java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: iconst_4
       2: aconst_null
       3: aload_1
       4: aload_2
       5: invokespecial #106                // Method a:(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
       8: return

  public void d(java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: iconst_2
       2: aconst_null
       3: aload_1
       4: aload_2
       5: invokespecial #106                // Method a:(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
       8: return

  public void e(java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: bipush        7
       3: aconst_null
       4: aload_1
       5: aload_2
       6: invokespecial #106                // Method a:(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
       9: return
}
