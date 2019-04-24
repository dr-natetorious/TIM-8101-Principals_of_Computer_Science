public class android.support.v7.e.a.b<T> {
  public android.support.v7.e.a.b(android.support.v7.g.d, android.support.v7.e.a.a<T>);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: invokestatic  #33                 // Method java/util/Collections.emptyList:()Ljava/util/List;
       8: putfield      #35                 // Field d:Ljava/util/List;
      11: aload_0
      12: aload_1
      13: putfield      #37                 // Field a:Landroid/support/v7/g/d;
      16: aload_0
      17: aload_2
      18: putfield      #39                 // Field b:Landroid/support/v7/e/a/a;
      21: return

  static android.support.v7.e.a.a a(android.support.v7.e.a.b);
    Code:
       0: aload_0
       1: getfield      #39                 // Field b:Landroid/support/v7/e/a/a;
       4: areturn

  static void a(android.support.v7.e.a.b, java.util.List, android.support.v7.g.c$b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #47                 // Method a:(Ljava/util/List;Landroid/support/v7/g/c$b;)V
       6: return

  static int b(android.support.v7.e.a.b);
    Code:
       0: aload_0
       1: getfield      #62                 // Field e:I
       4: ireturn

  public java.util.List<T> a();
    Code:
       0: aload_0
       1: getfield      #35                 // Field d:Ljava/util/List;
       4: areturn

  public void a(java.util.List<T>);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #49                 // Field c:Ljava/util/List;
       5: if_acmpne     9
       8: return
       9: aload_0
      10: getfield      #62                 // Field e:I
      13: iconst_1
      14: iadd
      15: istore_2
      16: aload_0
      17: iload_2
      18: putfield      #62                 // Field e:I
      21: aload_1
      22: ifnonnull     59
      25: aload_0
      26: getfield      #49                 // Field c:Ljava/util/List;
      29: invokeinterface #70,  1           // InterfaceMethod java/util/List.size:()I
      34: istore_2
      35: aload_0
      36: aconst_null
      37: putfield      #49                 // Field c:Ljava/util/List;
      40: aload_0
      41: invokestatic  #33                 // Method java/util/Collections.emptyList:()Ljava/util/List;
      44: putfield      #35                 // Field d:Ljava/util/List;
      47: aload_0
      48: getfield      #37                 // Field a:Landroid/support/v7/g/d;
      51: iconst_0
      52: iload_2
      53: invokeinterface #75,  3           // InterfaceMethod android/support/v7/g/d.b:(II)V
      58: return
      59: aload_0
      60: getfield      #49                 // Field c:Ljava/util/List;
      63: ifnonnull     96
      66: aload_0
      67: aload_1
      68: putfield      #49                 // Field c:Ljava/util/List;
      71: aload_0
      72: aload_1
      73: invokestatic  #53                 // Method java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
      76: putfield      #35                 // Field d:Ljava/util/List;
      79: aload_0
      80: getfield      #37                 // Field a:Landroid/support/v7/g/d;
      83: iconst_0
      84: aload_1
      85: invokeinterface #70,  1           // InterfaceMethod java/util/List.size:()I
      90: invokeinterface #77,  3           // InterfaceMethod android/support/v7/g/d.a:(II)V
      95: return
      96: aload_0
      97: getfield      #49                 // Field c:Ljava/util/List;
     100: astore_3
     101: aload_0
     102: getfield      #39                 // Field b:Landroid/support/v7/e/a/a;
     105: invokevirtual #82                 // Method android/support/v7/e/a/a.b:()Ljava/util/concurrent/Executor;
     108: new           #7                  // class android/support/v7/e/a/b$1
     111: dup
     112: aload_0
     113: aload_3
     114: aload_1
     115: iload_2
     116: invokespecial #85                 // Method android/support/v7/e/a/b$1."<init>":(Landroid/support/v7/e/a/b;Ljava/util/List;Ljava/util/List;I)V
     119: invokeinterface #91,  2           // InterfaceMethod java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
     124: return
}
