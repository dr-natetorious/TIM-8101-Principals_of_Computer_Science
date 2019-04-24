public class ryey.easer.plugins.b$a implements ryey.easer.plugins.b$b<ryey.easer.commons.local_plugin.d, ryey.easer.commons.local_plugin.f> {
  final ryey.easer.plugins.b$b<? extends ryey.easer.commons.local_plugin.d, ? extends ryey.easer.commons.local_plugin.f>[] a;

  ryey.easer.plugins.b$a(ryey.easer.plugins.b$b<? extends ryey.easer.commons.local_plugin.d, ? extends ryey.easer.commons.local_plugin.f>[]);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #19                 // Field a:[Lryey/easer/plugins/b$b;
       9: return

  public java.util.List<ryey.easer.commons.local_plugin.d> a();
    Code:
       0: new           #25                 // class java/util/ArrayList
       3: dup
       4: invokespecial #26                 // Method java/util/ArrayList."<init>":()V
       7: astore_3
       8: aload_0
       9: getfield      #19                 // Field a:[Lryey/easer/plugins/b$b;
      12: astore        4
      14: aload         4
      16: arraylength
      17: istore_2
      18: iconst_0
      19: istore_1
      20: iload_1
      21: iload_2
      22: if_icmpge     48
      25: aload_3
      26: aload         4
      28: iload_1
      29: aaload
      30: invokeinterface #28,  1           // InterfaceMethod ryey/easer/plugins/b$b.a:()Ljava/util/List;
      35: invokeinterface #34,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      40: pop
      41: iload_1
      42: iconst_1
      43: iadd
      44: istore_1
      45: goto          20
      48: aload_3
      49: areturn

  public java.util.List<ryey.easer.commons.local_plugin.d> a(android.content.Context);
    Code:
       0: new           #25                 // class java/util/ArrayList
       3: dup
       4: invokespecial #26                 // Method java/util/ArrayList."<init>":()V
       7: astore        4
       9: aload_0
      10: getfield      #19                 // Field a:[Lryey/easer/plugins/b$b;
      13: astore        5
      15: aload         5
      17: arraylength
      18: istore_3
      19: iconst_0
      20: istore_2
      21: iload_2
      22: iload_3
      23: if_icmpge     51
      26: aload         4
      28: aload         5
      30: iload_2
      31: aaload
      32: aload_1
      33: invokeinterface #38,  2           // InterfaceMethod ryey/easer/plugins/b$b.a:(Landroid/content/Context;)Ljava/util/List;
      38: invokeinterface #34,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      43: pop
      44: iload_2
      45: iconst_1
      46: iadd
      47: istore_2
      48: goto          21
      51: aload         4
      53: areturn

  public ryey.easer.commons.local_plugin.d a(ryey.easer.commons.local_plugin.e);
    Code:
       0: aload_0
       1: invokevirtual #41                 // Method a:()Ljava/util/List;
       4: invokeinterface #45,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       9: astore_2
      10: aload_2
      11: invokeinterface #51,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          50
      19: aload_2
      20: invokeinterface #55,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #57                 // class ryey/easer/commons/local_plugin/d
      28: astore_3
      29: aload_1
      30: invokevirtual #61                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      33: aload_3
      34: invokeinterface #65,  1           // InterfaceMethod ryey/easer/commons/local_plugin/d.d:()Lryey/easer/commons/local_plugin/e;
      39: invokevirtual #61                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      42: invokevirtual #69                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      45: ifeq          10
      48: aload_3
      49: areturn
      50: new           #71                 // class java/lang/IllegalAccessError
      53: dup
      54: invokespecial #72                 // Method java/lang/IllegalAccessError."<init>":()V
      57: athrow
}
