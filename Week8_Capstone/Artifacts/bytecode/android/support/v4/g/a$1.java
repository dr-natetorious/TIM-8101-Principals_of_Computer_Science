class android.support.v4.g.a$1 extends android.support.v4.g.h<K, V> {
  final android.support.v4.g.a a;

  android.support.v4.g.a$1(android.support.v4.g.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field a:Landroid/support/v4/g/a;
       5: aload_0
       6: invokespecial #19                 // Method android/support/v4/g/h."<init>":()V
       9: return

  protected int a();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/a;
       4: getfield      #25                 // Field android/support/v4/g/a.h:I
       7: ireturn

  protected int a(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: invokevirtual #28                 // Method android/support/v4/g/a.a:(Ljava/lang/Object;)I
       8: ireturn

  protected java.lang.Object a(int, int);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/a;
       4: getfield      #33                 // Field android/support/v4/g/a.g:[Ljava/lang/Object;
       7: iload_1
       8: iconst_1
       9: ishl
      10: iload_2
      11: iadd
      12: aaload
      13: areturn

  protected V a(int, V);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/a;
       4: iload_1
       5: aload_2
       6: invokevirtual #36                 // Method android/support/v4/g/a.a:(ILjava/lang/Object;)Ljava/lang/Object;
       9: areturn

  protected void a(int);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/a;
       4: iload_1
       5: invokevirtual #43                 // Method android/support/v4/g/a.d:(I)Ljava/lang/Object;
       8: pop
       9: return

  protected void a(K, V);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: aload_2
       6: invokevirtual #48                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       9: pop
      10: return

  protected int b(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: invokevirtual #51                 // Method android/support/v4/g/a.b:(Ljava/lang/Object;)I
       8: ireturn

  protected java.util.Map<K, V> b();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/a;
       4: areturn

  protected void c();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Landroid/support/v4/g/a;
       4: invokevirtual #57                 // Method android/support/v4/g/a.clear:()V
       7: return
}
