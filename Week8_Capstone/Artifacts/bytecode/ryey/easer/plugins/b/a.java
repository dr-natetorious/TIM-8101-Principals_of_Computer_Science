public abstract class ryey.easer.plugins.b.a implements ryey.easer.commons.local_plugin.f {
  protected java.lang.Boolean a;

  protected ryey.easer.plugins.b.a();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #14                 // Field a:Ljava/lang/Boolean;
       9: return

  protected ryey.easer.plugins.b.a(java.lang.Boolean);
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #14                 // Field a:Ljava/lang/Boolean;
       9: aload_0
      10: aload_1
      11: putfield      #14                 // Field a:Ljava/lang/Boolean;
      14: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #23                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
       5: putfield      #14                 // Field a:Ljava/lang/Boolean;
       8: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Ljava/lang/Boolean;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: iconst_1
      10: ireturn

  public java.lang.Boolean c();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Ljava/lang/Boolean;
       4: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: iconst_0
       1: istore_3
       2: aload_1
       3: ifnonnull     8
       6: iconst_0
       7: ireturn
       8: aload_0
       9: invokevirtual #32                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      12: aload_1
      13: invokevirtual #32                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      16: invokevirtual #34                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      19: ifne          24
      22: iconst_0
      23: ireturn
      24: iload_3
      25: istore_2
      26: aload_0
      27: invokevirtual #36                 // Method a:()Z
      30: ifeq          71
      33: aload_1
      34: checkcast     #6                  // class ryey/easer/commons/local_plugin/f
      37: invokeinterface #37,  1           // InterfaceMethod ryey/easer/commons/local_plugin/f.a:()Z
      42: ifne          47
      45: iconst_0
      46: ireturn
      47: iload_3
      48: istore_2
      49: aload_1
      50: checkcast     #2                  // class ryey/easer/plugins/b/a
      53: getfield      #14                 // Field a:Ljava/lang/Boolean;
      56: invokevirtual #40                 // Method java/lang/Boolean.booleanValue:()Z
      59: aload_0
      60: getfield      #14                 // Field a:Ljava/lang/Boolean;
      63: invokevirtual #40                 // Method java/lang/Boolean.booleanValue:()Z
      66: if_icmpne     71
      69: iconst_1
      70: istore_2
      71: iload_2
      72: ireturn
}
