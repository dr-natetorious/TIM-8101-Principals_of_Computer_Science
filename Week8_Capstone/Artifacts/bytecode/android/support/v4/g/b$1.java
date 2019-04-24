class android.support.v4.g.b$1 extends android.support.v4.g.h<E, E> {
  final android.support.v4.g.b a;

  android.support.v4.g.b$1(android.support.v4.g.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v4/g/b;
       5: aload_0
       6: invokespecial #19                 // Method android/support/v4/g/h."<init>":()V
       9: return

  protected int a();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/b;
       4: invokestatic  #24                 // Method android/support/v4/g/b.a:(Landroid/support/v4/g/b;)I
       7: ireturn

  protected int a(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/b;
       4: aload_1
       5: invokevirtual #27                 // Method android/support/v4/g/b.a:(Ljava/lang/Object;)I
       8: ireturn

  protected java.lang.Object a(int, int);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/b;
       4: invokestatic  #31                 // Method android/support/v4/g/b.b:(Landroid/support/v4/g/b;)[Ljava/lang/Object;
       7: iload_1
       8: aaload
       9: areturn

  protected E a(int, E);
    Code:
       0: new           #34                 // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc           #36                 // String not a map
       6: invokespecial #39                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
       9: athrow

  protected void a(int);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/b;
       4: iload_1
       5: invokevirtual #46                 // Method android/support/v4/g/b.c:(I)Ljava/lang/Object;
       8: pop
       9: return

  protected void a(E, E);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/b;
       4: aload_1
       5: invokevirtual #51                 // Method android/support/v4/g/b.add:(Ljava/lang/Object;)Z
       8: pop
       9: return

  protected int b(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/b;
       4: aload_1
       5: invokevirtual #27                 // Method android/support/v4/g/b.a:(Ljava/lang/Object;)I
       8: ireturn

  protected java.util.Map<E, E> b();
    Code:
       0: new           #34                 // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc           #36                 // String not a map
       6: invokespecial #39                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
       9: athrow

  protected void c();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/b;
       4: invokevirtual #57                 // Method android/support/v4/g/b.clear:()V
       7: return
}
