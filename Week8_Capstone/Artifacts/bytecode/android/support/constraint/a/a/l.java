public class android.support.constraint.a.a.l {
  java.util.HashSet<android.support.constraint.a.a.l> h;

  int i;

  public android.support.constraint.a.a.l();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #15                 // class java/util/HashSet
       8: dup
       9: iconst_2
      10: invokespecial #18                 // Method java/util/HashSet."<init>":(I)V
      13: putfield      #20                 // Field h:Ljava/util/HashSet;
      16: aload_0
      17: iconst_0
      18: putfield      #22                 // Field i:I
      21: return

  public void a();
    Code:
       0: return

  public void a(android.support.constraint.a.a.l);
    Code:
       0: aload_0
       1: getfield      #20                 // Field h:Ljava/util/HashSet;
       4: aload_1
       5: invokevirtual #29                 // Method java/util/HashSet.add:(Ljava/lang/Object;)Z
       8: pop
       9: return

  public void b();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #22                 // Field i:I
       5: aload_0
       6: getfield      #20                 // Field h:Ljava/util/HashSet;
       9: invokevirtual #33                 // Method java/util/HashSet.clear:()V
      12: return

  public void e();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #22                 // Field i:I
       5: aload_0
       6: getfield      #20                 // Field h:Ljava/util/HashSet;
       9: invokevirtual #38                 // Method java/util/HashSet.iterator:()Ljava/util/Iterator;
      12: astore_1
      13: aload_1
      14: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      19: ifeq          37
      22: aload_1
      23: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      28: checkcast     #2                  // class android/support/constraint/a/a/l
      31: invokevirtual #50                 // Method e:()V
      34: goto          13
      37: return

  public void f();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #22                 // Field i:I
       5: aload_0
       6: getfield      #20                 // Field h:Ljava/util/HashSet;
       9: invokevirtual #38                 // Method java/util/HashSet.iterator:()Ljava/util/Iterator;
      12: astore_1
      13: aload_1
      14: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      19: ifeq          37
      22: aload_1
      23: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      28: checkcast     #2                  // class android/support/constraint/a/a/l
      31: invokevirtual #53                 // Method a:()V
      34: goto          13
      37: return

  public boolean g();
    Code:
       0: aload_0
       1: getfield      #22                 // Field i:I
       4: iconst_1
       5: if_icmpne     10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn
}
