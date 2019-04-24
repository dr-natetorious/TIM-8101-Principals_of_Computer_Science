public abstract class ryey.easer.core.a.a.a<T extends ryey.easer.core.a.f & ryey.easer.core.a.l & ryey.easer.core.a.m, T_backend extends ryey.easer.core.a.a.a.b<T>> {
  protected final android.content.Context a;

  protected final T_backend[] b;

  protected ryey.easer.core.a.a.a(android.content.Context, T_backend[]);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Landroid/content/Context;
       9: aload_0
      10: aload_2
      11: putfield      #19                 // Field b:[Lryey/easer/core/a/a/a/b;
      14: return

  public java.util.List<java.lang.String> a();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:[Lryey/easer/core/a/a/a/b;
       4: astore        4
       6: aload         4
       8: arraylength
       9: istore_2
      10: aconst_null
      11: astore_3
      12: iconst_0
      13: istore_1
      14: iload_1
      15: iload_2
      16: if_icmpge     61
      19: aload         4
      21: iload_1
      22: aaload
      23: astore        5
      25: aload_3
      26: ifnonnull     40
      29: aload         5
      31: invokeinterface #27,  1           // InterfaceMethod ryey/easer/core/a/a/a/b.a:()Ljava/util/List;
      36: astore_3
      37: goto          54
      40: aload_3
      41: aload         5
      43: invokeinterface #27,  1           // InterfaceMethod ryey/easer/core/a/a/a/b.a:()Ljava/util/List;
      48: invokeinterface #33,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      53: pop
      54: iload_1
      55: iconst_1
      56: iadd
      57: istore_1
      58: goto          14
      61: aload_3
      62: areturn

  public T a(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:[Lryey/easer/core/a/a/a/b;
       4: astore        4
       6: aload         4
       8: arraylength
       9: istore_3
      10: iconst_0
      11: istore_2
      12: iload_2
      13: iload_3
      14: if_icmpge     73
      17: aload         4
      19: iload_2
      20: aaload
      21: astore        5
      23: aload         5
      25: aload_1
      26: invokeinterface #41,  2           // InterfaceMethod ryey/easer/core/a/a/a/b.b:(Ljava/lang/String;)Lryey/easer/core/a/f;
      31: astore        6
      33: aload         6
      35: areturn
      36: ldc           #43                 // String data not found on backend <%s>
      38: iconst_1
      39: anewarray     #5                  // class java/lang/Object
      42: dup
      43: iconst_0
      44: aload         5
      46: invokevirtual #47                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      49: invokevirtual #53                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      52: aastore
      53: invokestatic  #59                 // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      56: goto          66
      59: astore        5
      61: aload         5
      63: invokestatic  #64                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      66: iload_2
      67: iconst_1
      68: iadd
      69: istore_2
      70: goto          12
      73: aconst_null
      74: areturn
      75: astore        6
      77: goto          36
    Exception table:
       from    to  target type
          23    33    59   Class ryey/easer/commons/local_plugin/b
          23    33    75   Class java/io/FileNotFoundException

  public boolean a(java.lang.String, T);
    Code:
       0: aload_1
       1: aload_2
       2: invokeinterface #70,  1           // InterfaceMethod ryey/easer/core/a/f.a:()Ljava/lang/String;
       7: invokevirtual #76                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      10: ifeq          20
      13: aload_0
      14: aload_2
      15: invokevirtual #79                 // Method b:(Lryey/easer/core/a/f;)V
      18: iconst_1
      19: ireturn
      20: aload_0
      21: aload_2
      22: invokevirtual #82                 // Method a:(Lryey/easer/core/a/f;)Z
      25: istore        5
      27: iconst_0
      28: istore_3
      29: iload         5
      31: ifne          36
      34: iconst_0
      35: ireturn
      36: aload_0
      37: aload_1
      38: aload_2
      39: invokevirtual #85                 // Method b:(Ljava/lang/String;Lryey/easer/core/a/f;)V
      42: aload_0
      43: getfield      #19                 // Field b:[Lryey/easer/core/a/a/a/b;
      46: astore_2
      47: aload_2
      48: arraylength
      49: istore        4
      51: iload_3
      52: iload         4
      54: if_icmpge     90
      57: aload_2
      58: iload_3
      59: aaload
      60: astore        6
      62: aload         6
      64: aload_1
      65: invokeinterface #88,  2           // InterfaceMethod ryey/easer/core/a/a/a/b.a:(Ljava/lang/String;)Z
      70: ifeq          83
      73: aload         6
      75: aload_1
      76: invokeinterface #92,  2           // InterfaceMethod ryey/easer/core/a/a/a/b.c:(Ljava/lang/String;)V
      81: iconst_1
      82: ireturn
      83: iload_3
      84: iconst_1
      85: iadd
      86: istore_3
      87: goto          51
      90: new           #94                 // class java/lang/IllegalAccessError
      93: dup
      94: invokespecial #95                 // Method java/lang/IllegalAccessError."<init>":()V
      97: athrow

  public boolean a(T);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:[Lryey/easer/core/a/a/a/b;
       4: astore        6
       6: aload         6
       8: arraylength
       9: istore_3
      10: iconst_0
      11: istore_2
      12: iload_2
      13: iload_3
      14: if_icmpge     110
      17: aload         6
      19: iload_2
      20: aaload
      21: astore        5
      23: aload         5
      25: aload_1
      26: invokeinterface #70,  1           // InterfaceMethod ryey/easer/core/a/f.a:()Ljava/lang/String;
      31: invokeinterface #88,  2           // InterfaceMethod ryey/easer/core/a/a/a/b.a:(Ljava/lang/String;)Z
      36: ifeq          103
      39: aload         5
      41: aload_1
      42: invokeinterface #70,  1           // InterfaceMethod ryey/easer/core/a/f.a:()Ljava/lang/String;
      47: invokeinterface #41,  2           // InterfaceMethod ryey/easer/core/a/a/a/b.b:(Ljava/lang/String;)Lryey/easer/core/a/f;
      52: checkcast     #98                 // class ryey/easer/core/a/l
      55: invokeinterface #101,  1          // InterfaceMethod ryey/easer/core/a/l.b:()Z
      60: istore        4
      62: iload         4
      64: ifeq          69
      67: iconst_0
      68: ireturn
      69: ldc           #103                // String replace an invalid existing data (%s)
      71: iconst_1
      72: anewarray     #5                  // class java/lang/Object
      75: dup
      76: iconst_0
      77: aload_1
      78: invokeinterface #70,  1           // InterfaceMethod ryey/easer/core/a/f.a:()Ljava/lang/String;
      83: aastore
      84: invokestatic  #59                 // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      87: aload         5
      89: aload_1
      90: invokeinterface #70,  1           // InterfaceMethod ryey/easer/core/a/f.a:()Ljava/lang/String;
      95: invokeinterface #92,  2           // InterfaceMethod ryey/easer/core/a/a/a/b.c:(Ljava/lang/String;)V
     100: goto          110
     103: iload_2
     104: iconst_1
     105: iadd
     106: istore_2
     107: goto          12
     110: aload_0
     111: getfield      #19                 // Field b:[Lryey/easer/core/a/a/a/b;
     114: iconst_0
     115: aaload
     116: aload_1
     117: invokeinterface #105,  2          // InterfaceMethod ryey/easer/core/a/a/a/b.a:(Lryey/easer/core/a/f;)V
     122: iconst_1
     123: ireturn
     124: astore        6
     126: goto          69
    Exception table:
       from    to  target type
          39    62   124   Class ryey/easer/commons/local_plugin/b

  protected abstract void b(java.lang.String, T);

  void b(T);
    Code:
       0: aload_1
       1: invokeinterface #70,  1           // InterfaceMethod ryey/easer/core/a/f.a:()Ljava/lang/String;
       6: astore        4
       8: aload_0
       9: getfield      #19                 // Field b:[Lryey/easer/core/a/a/a/b;
      12: astore        5
      14: aload         5
      16: arraylength
      17: istore_3
      18: iconst_0
      19: istore_2
      20: iload_2
      21: iload_3
      22: if_icmpge     66
      25: aload         5
      27: iload_2
      28: aaload
      29: astore        6
      31: aload         6
      33: aload         4
      35: invokeinterface #88,  2           // InterfaceMethod ryey/easer/core/a/a/a/b.a:(Ljava/lang/String;)Z
      40: ifeq          59
      43: aload         6
      45: aload         4
      47: invokeinterface #92,  2           // InterfaceMethod ryey/easer/core/a/a/a/b.c:(Ljava/lang/String;)V
      52: aload_0
      53: aload_1
      54: invokevirtual #82                 // Method a:(Lryey/easer/core/a/f;)Z
      57: pop
      58: return
      59: iload_2
      60: iconst_1
      61: iadd
      62: istore_2
      63: goto          20
      66: new           #94                 // class java/lang/IllegalAccessError
      69: dup
      70: invokespecial #95                 // Method java/lang/IllegalAccessError."<init>":()V
      73: athrow

  abstract boolean b(java.lang.String);

  public boolean c(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #109                // Method b:(Ljava/lang/String;)Z
       5: istore        4
       7: iconst_0
       8: istore_2
       9: iload         4
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #19                 // Field b:[Lryey/easer/core/a/a/a/b;
      20: astore        5
      22: aload         5
      24: arraylength
      25: istore_3
      26: iload_2
      27: iload_3
      28: if_icmpge     65
      31: aload         5
      33: iload_2
      34: aaload
      35: astore        6
      37: aload         6
      39: aload_1
      40: invokeinterface #88,  2           // InterfaceMethod ryey/easer/core/a/a/a/b.a:(Ljava/lang/String;)Z
      45: ifeq          58
      48: aload         6
      50: aload_1
      51: invokeinterface #92,  2           // InterfaceMethod ryey/easer/core/a/a/a/b.c:(Ljava/lang/String;)V
      56: iconst_1
      57: ireturn
      58: iload_2
      59: iconst_1
      60: iadd
      61: istore_2
      62: goto          26
      65: new           #111                // class java/lang/IllegalStateException
      68: dup
      69: invokespecial #112                // Method java/lang/IllegalStateException."<init>":()V
      72: athrow
}
