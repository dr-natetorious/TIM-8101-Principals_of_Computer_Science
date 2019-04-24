class android.support.v4.view.f$b {
  android.support.v4.view.f$b();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public void a(android.view.LayoutInflater, android.view.LayoutInflater$Factory2);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #20                 // Method android/view/LayoutInflater.setFactory2:(Landroid/view/LayoutInflater$Factory2;)V
       5: aload_1
       6: invokevirtual #24                 // Method android/view/LayoutInflater.getFactory:()Landroid/view/LayoutInflater$Factory;
       9: astore_3
      10: aload_3
      11: instanceof    #26                 // class android/view/LayoutInflater$Factory2
      14: ifeq          26
      17: aload_1
      18: aload_3
      19: checkcast     #26                 // class android/view/LayoutInflater$Factory2
      22: invokestatic  #28                 // Method android/support/v4/view/f.a:(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V
      25: return
      26: aload_1
      27: aload_2
      28: invokestatic  #28                 // Method android/support/v4/view/f.a:(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V
      31: return
}
