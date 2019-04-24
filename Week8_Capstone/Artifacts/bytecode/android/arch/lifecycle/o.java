public class android.arch.lifecycle.o {
  public android.arch.lifecycle.o(android.arch.lifecycle.p, android.arch.lifecycle.o$a);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_2
       6: putfield      #17                 // Field a:Landroid/arch/lifecycle/o$a;
       9: aload_0
      10: aload_1
      11: putfield      #19                 // Field b:Landroid/arch/lifecycle/p;
      14: return

  public <T extends android.arch.lifecycle.n> T a(java.lang.Class<T>);
    Code:
       0: aload_1
       1: invokevirtual #27                 // Method java/lang/Class.getCanonicalName:()Ljava/lang/String;
       4: astore_2
       5: aload_2
       6: ifnonnull     19
       9: new           #29                 // class java/lang/IllegalArgumentException
      12: dup
      13: ldc           #31                 // String Local and anonymous classes can not be ViewModels
      15: invokespecial #34                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      18: athrow
      19: new           #36                 // class java/lang/StringBuilder
      22: dup
      23: invokespecial #37                 // Method java/lang/StringBuilder."<init>":()V
      26: astore_3
      27: aload_3
      28: ldc           #39                 // String android.arch.lifecycle.ViewModelProvider.DefaultKey:
      30: invokevirtual #43                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_3
      35: aload_2
      36: invokevirtual #43                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_0
      41: aload_3
      42: invokevirtual #46                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      45: aload_1
      46: invokevirtual #49                 // Method a:(Ljava/lang/String;Ljava/lang/Class;)Landroid/arch/lifecycle/n;
      49: areturn

  public <T extends android.arch.lifecycle.n> T a(java.lang.String, java.lang.Class<T>);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:Landroid/arch/lifecycle/p;
       4: aload_1
       5: invokevirtual #56                 // Method android/arch/lifecycle/p.a:(Ljava/lang/String;)Landroid/arch/lifecycle/n;
       8: astore_3
       9: aload_2
      10: aload_3
      11: invokevirtual #60                 // Method java/lang/Class.isInstance:(Ljava/lang/Object;)Z
      14: ifeq          19
      17: aload_3
      18: areturn
      19: aload_0
      20: getfield      #17                 // Field a:Landroid/arch/lifecycle/o$a;
      23: aload_2
      24: invokeinterface #62,  2           // InterfaceMethod android/arch/lifecycle/o$a.a:(Ljava/lang/Class;)Landroid/arch/lifecycle/n;
      29: astore_2
      30: aload_0
      31: getfield      #19                 // Field b:Landroid/arch/lifecycle/p;
      34: aload_1
      35: aload_2
      36: invokevirtual #65                 // Method android/arch/lifecycle/p.a:(Ljava/lang/String;Landroid/arch/lifecycle/n;)V
      39: aload_2
      40: areturn
}
