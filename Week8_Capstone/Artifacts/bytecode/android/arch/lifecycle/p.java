public class android.arch.lifecycle.p {
  public android.arch.lifecycle.p();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #13                 // class java/util/HashMap
       8: dup
       9: invokespecial #14                 // Method java/util/HashMap."<init>":()V
      12: putfield      #16                 // Field a:Ljava/util/HashMap;
      15: return

  final android.arch.lifecycle.n a(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Ljava/util/HashMap;
       4: aload_1
       5: invokevirtual #22                 // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #24                 // class android/arch/lifecycle/n
      11: areturn

  public final void a();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Ljava/util/HashMap;
       4: invokevirtual #28                 // Method java/util/HashMap.values:()Ljava/util/Collection;
       7: invokeinterface #34,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      12: astore_1
      13: aload_1
      14: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      19: ifeq          37
      22: aload_1
      23: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      28: checkcast     #24                 // class android/arch/lifecycle/n
      31: invokevirtual #46                 // Method android/arch/lifecycle/n.a:()V
      34: goto          13
      37: aload_0
      38: getfield      #16                 // Field a:Ljava/util/HashMap;
      41: invokevirtual #49                 // Method java/util/HashMap.clear:()V
      44: return

  final void a(java.lang.String, android.arch.lifecycle.n);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Ljava/util/HashMap;
       4: aload_1
       5: invokevirtual #22                 // Method java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #24                 // class android/arch/lifecycle/n
      11: astore_3
      12: aload_3
      13: ifnull        20
      16: aload_3
      17: invokevirtual #46                 // Method android/arch/lifecycle/n.a:()V
      20: aload_0
      21: getfield      #16                 // Field a:Ljava/util/HashMap;
      24: aload_1
      25: aload_2
      26: invokevirtual #54                 // Method java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      29: pop
      30: return
}
