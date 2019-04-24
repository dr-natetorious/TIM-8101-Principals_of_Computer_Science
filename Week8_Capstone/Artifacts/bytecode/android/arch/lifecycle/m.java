public class android.arch.lifecycle.m extends android.app.Fragment {
  public android.arch.lifecycle.m();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method android/app/Fragment."<init>":()V
       4: return

  public static void a(android.app.Activity);
    Code:
       0: aload_0
       1: invokevirtual #20                 // Method android/app/Activity.getFragmentManager:()Landroid/app/FragmentManager;
       4: astore_0
       5: aload_0
       6: ldc           #22                 // String android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag
       8: invokevirtual #28                 // Method android/app/FragmentManager.findFragmentByTag:(Ljava/lang/String;)Landroid/app/Fragment;
      11: ifnonnull     39
      14: aload_0
      15: invokevirtual #32                 // Method android/app/FragmentManager.beginTransaction:()Landroid/app/FragmentTransaction;
      18: new           #2                  // class android/arch/lifecycle/m
      21: dup
      22: invokespecial #33                 // Method "<init>":()V
      25: ldc           #22                 // String android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag
      27: invokevirtual #39                 // Method android/app/FragmentTransaction.add:(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;
      30: invokevirtual #43                 // Method android/app/FragmentTransaction.commit:()I
      33: pop
      34: aload_0
      35: invokevirtual #47                 // Method android/app/FragmentManager.executePendingTransactions:()Z
      38: pop
      39: return

  public void onActivityCreated(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #80                 // Method android/app/Fragment.onActivityCreated:(Landroid/os/Bundle;)V
       5: aload_0
       6: aload_0
       7: getfield      #82                 // Field a:Landroid/arch/lifecycle/m$a;
      10: invokespecial #84                 // Method a:(Landroid/arch/lifecycle/m$a;)V
      13: aload_0
      14: getstatic     #90                 // Field android/arch/lifecycle/c$a.ON_CREATE:Landroid/arch/lifecycle/c$a;
      17: invokespecial #91                 // Method a:(Landroid/arch/lifecycle/c$a;)V
      20: return

  public void onDestroy();
    Code:
       0: aload_0
       1: invokespecial #94                 // Method android/app/Fragment.onDestroy:()V
       4: aload_0
       5: getstatic     #97                 // Field android/arch/lifecycle/c$a.ON_DESTROY:Landroid/arch/lifecycle/c$a;
       8: invokespecial #91                 // Method a:(Landroid/arch/lifecycle/c$a;)V
      11: aload_0
      12: aconst_null
      13: putfield      #82                 // Field a:Landroid/arch/lifecycle/m$a;
      16: return

  public void onPause();
    Code:
       0: aload_0
       1: invokespecial #100                // Method android/app/Fragment.onPause:()V
       4: aload_0
       5: getstatic     #103                // Field android/arch/lifecycle/c$a.ON_PAUSE:Landroid/arch/lifecycle/c$a;
       8: invokespecial #91                 // Method a:(Landroid/arch/lifecycle/c$a;)V
      11: return

  public void onResume();
    Code:
       0: aload_0
       1: invokespecial #106                // Method android/app/Fragment.onResume:()V
       4: aload_0
       5: aload_0
       6: getfield      #82                 // Field a:Landroid/arch/lifecycle/m$a;
       9: invokespecial #108                // Method c:(Landroid/arch/lifecycle/m$a;)V
      12: aload_0
      13: getstatic     #111                // Field android/arch/lifecycle/c$a.ON_RESUME:Landroid/arch/lifecycle/c$a;
      16: invokespecial #91                 // Method a:(Landroid/arch/lifecycle/c$a;)V
      19: return

  public void onStart();
    Code:
       0: aload_0
       1: invokespecial #114                // Method android/app/Fragment.onStart:()V
       4: aload_0
       5: aload_0
       6: getfield      #82                 // Field a:Landroid/arch/lifecycle/m$a;
       9: invokespecial #116                // Method b:(Landroid/arch/lifecycle/m$a;)V
      12: aload_0
      13: getstatic     #119                // Field android/arch/lifecycle/c$a.ON_START:Landroid/arch/lifecycle/c$a;
      16: invokespecial #91                 // Method a:(Landroid/arch/lifecycle/c$a;)V
      19: return

  public void onStop();
    Code:
       0: aload_0
       1: invokespecial #122                // Method android/app/Fragment.onStop:()V
       4: aload_0
       5: getstatic     #125                // Field android/arch/lifecycle/c$a.ON_STOP:Landroid/arch/lifecycle/c$a;
       8: invokespecial #91                 // Method a:(Landroid/arch/lifecycle/c$a;)V
      11: return
}
