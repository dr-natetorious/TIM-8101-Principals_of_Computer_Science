public class android.support.v4.app.aj extends android.app.Activity implements android.arch.lifecycle.e {
  public android.support.v4.app.aj();
    Code:
       0: aload_0
       1: invokespecial #18                 // Method android/app/Activity."<init>":()V
       4: aload_0
       5: new           #20                 // class android/support/v4/g/m
       8: dup
       9: invokespecial #21                 // Method android/support/v4/g/m."<init>":()V
      12: putfield      #23                 // Field mExtraDataMap:Landroid/support/v4/g/m;
      15: aload_0
      16: new           #25                 // class android/arch/lifecycle/f
      19: dup
      20: aload_0
      21: invokespecial #28                 // Method android/arch/lifecycle/f."<init>":(Landroid/arch/lifecycle/e;)V
      24: putfield      #30                 // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
      27: return

  public <T extends android.support.v4.app.aj$a> T getExtraData(java.lang.Class<T>);
    Code:
       0: aload_0
       1: getfield      #23                 // Field mExtraDataMap:Landroid/support/v4/g/m;
       4: aload_1
       5: invokevirtual #37                 // Method android/support/v4/g/m.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #8                  // class android/support/v4/app/aj$a
      11: areturn

  public android.arch.lifecycle.c getLifecycle();
    Code:
       0: aload_0
       1: getfield      #30                 // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
       4: areturn

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #45                 // Method android/app/Activity.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: invokestatic  #50                 // Method android/arch/lifecycle/m.a:(Landroid/app/Activity;)V
       9: return

  protected void onSaveInstanceState(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #30                 // Field mLifecycleRegistry:Landroid/arch/lifecycle/f;
       4: getstatic     #57                 // Field android/arch/lifecycle/c$b.c:Landroid/arch/lifecycle/c$b;
       7: invokevirtual #60                 // Method android/arch/lifecycle/f.a:(Landroid/arch/lifecycle/c$b;)V
      10: aload_0
      11: aload_1
      12: invokespecial #62                 // Method android/app/Activity.onSaveInstanceState:(Landroid/os/Bundle;)V
      15: return

  public void putExtraData(android.support.v4.app.aj$a);
    Code:
       0: aload_0
       1: getfield      #23                 // Field mExtraDataMap:Landroid/support/v4/g/m;
       4: aload_1
       5: invokevirtual #70                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
       8: aload_1
       9: invokevirtual #74                 // Method android/support/v4/g/m.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      12: pop
      13: return
}
