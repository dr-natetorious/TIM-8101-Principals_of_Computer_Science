public final class ryey.easer.core.a.g implements ryey.easer.core.a.f,ryey.easer.core.a.l,ryey.easer.core.a.m {
  static final boolean c;

  java.lang.String a;

  final com.google.common.a.k<java.lang.String, ryey.easer.core.a.h> b;

  static {};
    Code:
       0: return

  public ryey.easer.core.a.g(int);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: invokestatic  #33                 // Method com/google/common/a/g.k:()Lcom/google/common/a/g;
       8: putfield      #35                 // Field b:Lcom/google/common/a/k;
      11: aload_0
      12: iload_1
      13: putfield      #37                 // Field d:I
      16: return

  public java.lang.String a();
    Code:
       0: aload_0
       1: getfield      #40                 // Field a:Ljava/lang/String;
       4: areturn

  public void a(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #40                 // Field a:Ljava/lang/String;
       5: return

  public void a(java.lang.String, java.util.Collection<ryey.easer.commons.local_plugin.c.b>);
    Code:
       0: new           #44                 // class java/util/ArrayList
       3: dup
       4: aload_2
       5: invokeinterface #50,  1           // InterfaceMethod java/util/Collection.size:()I
      10: invokespecial #52                 // Method java/util/ArrayList."<init>":(I)V
      13: astore_3
      14: aload_2
      15: invokeinterface #56,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      20: astore_2
      21: aload_2
      22: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      27: ifeq          56
      30: aload_3
      31: new           #64                 // class ryey/easer/core/a/h
      34: dup
      35: aload_2
      36: invokeinterface #68,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      41: checkcast     #70                 // class ryey/easer/commons/local_plugin/c/b
      44: invokespecial #73                 // Method ryey/easer/core/a/h."<init>":(Lryey/easer/commons/local_plugin/c/b;)V
      47: invokeinterface #77,  2           // InterfaceMethod java/util/Collection.add:(Ljava/lang/Object;)Z
      52: pop
      53: goto          21
      56: aload_0
      57: getfield      #35                 // Field b:Lcom/google/common/a/k;
      60: aload_1
      61: aload_3
      62: invokeinterface #82,  3           // InterfaceMethod com/google/common/a/k.b:(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Collection;
      67: pop
      68: return

  public void a(java.lang.String, ryey.easer.c.a);
    Code:
       0: aload_0
       1: getfield      #35                 // Field b:Lcom/google/common/a/k;
       4: aload_1
       5: new           #64                 // class ryey/easer/core/a/h
       8: dup
       9: aload_2
      10: invokespecial #88                 // Method ryey/easer/core/a/h."<init>":(Lryey/easer/c/a;)V
      13: invokeinterface #91,  3           // InterfaceMethod com/google/common/a/k.c:(Ljava/lang/Object;Ljava/lang/Object;)Z
      18: pop
      19: return

  public void a(java.lang.String, ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: getfield      #35                 // Field b:Lcom/google/common/a/k;
       4: aload_1
       5: new           #64                 // class ryey/easer/core/a/h
       8: dup
       9: aload_2
      10: invokespecial #73                 // Method ryey/easer/core/a/h."<init>":(Lryey/easer/commons/local_plugin/c/b;)V
      13: invokeinterface #91,  3           // InterfaceMethod com/google/common/a/k.c:(Ljava/lang/Object;Ljava/lang/Object;)Z
      18: pop
      19: return

  public java.util.Collection<ryey.easer.core.a.h> b(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #35                 // Field b:Lcom/google/common/a/k;
       4: aload_1
       5: invokeinterface #96,  2           // InterfaceMethod com/google/common/a/k.d:(Ljava/lang/Object;)Ljava/util/Collection;
      10: areturn

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #40                 // Field a:Ljava/lang/String;
       4: ifnull        22
       7: aload_0
       8: getfield      #40                 // Field a:Ljava/lang/String;
      11: invokevirtual #102                // Method java/lang/String.isEmpty:()Z
      14: ifeq          20
      17: goto          22
      20: iconst_1
      21: ireturn
      22: iconst_0
      23: ireturn

  public java.util.Set<java.lang.String> c();
    Code:
       0: aload_0
       1: getfield      #35                 // Field b:Lcom/google/common/a/k;
       4: invokeinterface #106,  1          // InterfaceMethod com/google/common/a/k.e:()Ljava/util/Set;
       9: areturn

  public int d();
    Code:
       0: aload_0
       1: getfield      #37                 // Field d:I
       4: ireturn

  public java.util.Set<java.lang.String> e();
    Code:
       0: new           #109                // class android/support/v4/g/b
       3: dup
       4: invokespecial #110                // Method android/support/v4/g/b."<init>":()V
       7: astore_1
       8: aload_0
       9: getfield      #35                 // Field b:Lcom/google/common/a/k;
      12: invokeinterface #114,  1          // InterfaceMethod com/google/common/a/k.g:()Lcom/google/common/a/m;
      17: invokeinterface #117,  1          // InterfaceMethod com/google/common/a/m.iterator:()Ljava/util/Iterator;
      22: astore_2
      23: aload_2
      24: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      29: ifeq          141
      32: aload_2
      33: invokeinterface #68,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      38: checkcast     #99                 // class java/lang/String
      41: astore_3
      42: aload_0
      43: getfield      #35                 // Field b:Lcom/google/common/a/k;
      46: aload_3
      47: invokeinterface #96,  2           // InterfaceMethod com/google/common/a/k.d:(Ljava/lang/Object;)Ljava/util/Collection;
      52: invokeinterface #56,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      57: astore_3
      58: aload_3
      59: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      64: ifeq          23
      67: aload_3
      68: invokeinterface #68,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      73: checkcast     #64                 // class ryey/easer/core/a/h
      76: astore        4
      78: aload         4
      80: invokevirtual #119                // Method ryey/easer/core/a/h.a:()Z
      83: ifeq          89
      86: goto          23
      89: aload         4
      91: getfield      #122                // Field ryey/easer/core/a/h.a:Lryey/easer/commons/local_plugin/c/b;
      94: astore        4
      96: getstatic     #124                // Field c:Z
      99: ifne          115
     102: aload         4
     104: ifnonnull     115
     107: new           #126                // class java/lang/AssertionError
     110: dup
     111: invokespecial #127                // Method java/lang/AssertionError."<init>":()V
     114: athrow
     115: aload         4
     117: invokeinterface #129,  1          // InterfaceMethod ryey/easer/commons/local_plugin/c/b.b:()Ljava/util/Set;
     122: astore        4
     124: aload         4
     126: ifnull        58
     129: aload_1
     130: aload         4
     132: invokeinterface #135,  2          // InterfaceMethod java/util/Set.addAll:(Ljava/util/Collection;)Z
     137: pop
     138: goto          58
     141: aload_1
     142: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class ryey/easer/core/a/g
       4: ifne          9
       7: iconst_0
       8: ireturn
       9: aload_1
      10: checkcast     #2                  // class ryey/easer/core/a/g
      13: astore_1
      14: aload_0
      15: invokevirtual #138                // Method a:()Ljava/lang/String;
      18: aload_1
      19: invokevirtual #138                // Method a:()Ljava/lang/String;
      22: invokevirtual #140                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      25: ifne          30
      28: iconst_0
      29: ireturn
      30: aload_0
      31: getfield      #35                 // Field b:Lcom/google/common/a/k;
      34: aload_1
      35: getfield      #35                 // Field b:Lcom/google/common/a/k;
      38: invokeinterface #141,  2          // InterfaceMethod com/google/common/a/k.equals:(Ljava/lang/Object;)Z
      43: ifne          48
      46: iconst_0
      47: ireturn
      48: iconst_1
      49: ireturn
}
