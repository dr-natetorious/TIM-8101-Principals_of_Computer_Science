public abstract class ryey.easer.plugins.b.f implements ryey.easer.commons.local_plugin.f {
  protected java.lang.String a;

  protected ryey.easer.plugins.b.f();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #14                 // Field a:Ljava/lang/String;
       9: return

  protected ryey.easer.plugins.b.f(java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #14                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_1
      11: putfield      #14                 // Field a:Ljava/lang/String;
      14: return

  public void a(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Ljava/lang/String;
       5: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Ljava/lang/String;
       4: invokestatic  #22                 // Method ryey/easer/b.a:(Ljava/lang/String;)Z
       7: ifeq          12
      10: iconst_0
      11: ireturn
      12: iconst_1
      13: ireturn

  public java.lang.String c();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Ljava/lang/String;
       4: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: iconst_0
       5: ireturn
       6: aload_0
       7: invokevirtual #30                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      10: aload_1
      11: invokevirtual #30                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      14: invokevirtual #32                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      17: ifne          22
      20: iconst_0
      21: ireturn
      22: aload_0
      23: invokevirtual #34                 // Method a:()Z
      26: ifeq          58
      29: aload_1
      30: checkcast     #6                  // class ryey/easer/commons/local_plugin/f
      33: invokeinterface #35,  1           // InterfaceMethod ryey/easer/commons/local_plugin/f.a:()Z
      38: ifne          43
      41: iconst_0
      42: ireturn
      43: aload_0
      44: getfield      #14                 // Field a:Ljava/lang/String;
      47: aload_1
      48: checkcast     #2                  // class ryey/easer/plugins/b/f
      51: getfield      #14                 // Field a:Ljava/lang/String;
      54: invokevirtual #38                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      57: ireturn
      58: iconst_0
      59: ireturn
}
