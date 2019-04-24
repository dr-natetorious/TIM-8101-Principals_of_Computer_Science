public abstract class android.support.v4.view.c {
  public android.support.v4.view.c(android.content.Context);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #21                 // Field a:Landroid/content/Context;
       9: return

  public abstract android.view.View a();

  public android.view.View a(android.view.MenuItem);
    Code:
       0: aload_0
       1: invokevirtual #26                 // Method a:()Landroid/view/View;
       4: areturn

  public void a(android.support.v4.view.c$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #29                 // Field b:Landroid/support/v4/view/c$a;
       5: return

  public void a(android.support.v4.view.c$b);
    Code:
       0: aload_0
       1: getfield      #32                 // Field c:Landroid/support/v4/view/c$b;
       4: ifnull        55
       7: aload_1
       8: ifnull        55
      11: new           #34                 // class java/lang/StringBuilder
      14: dup
      15: invokespecial #35                 // Method java/lang/StringBuilder."<init>":()V
      18: astore_2
      19: aload_2
      20: ldc           #37                 // String setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this
      22: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      25: pop
      26: aload_2
      27: aload_0
      28: invokevirtual #45                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      31: invokevirtual #51                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      34: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      37: pop
      38: aload_2
      39: ldc           #53                 // String  instance while it is still in use somewhere else?
      41: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      44: pop
      45: ldc           #55                 // String ActionProvider(support)
      47: aload_2
      48: invokevirtual #58                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: invokestatic  #64                 // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      54: pop
      55: aload_0
      56: aload_1
      57: putfield      #32                 // Field c:Landroid/support/v4/view/c$b;
      60: return

  public void a(android.view.SubMenu);
    Code:
       0: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/support/v4/view/c$a;
       4: ifnull        17
       7: aload_0
       8: getfield      #29                 // Field b:Landroid/support/v4/view/c$a;
      11: iload_1
      12: invokeinterface #68,  2           // InterfaceMethod android/support/v4/view/c$a.b:(Z)V
      17: return

  public boolean b();
    Code:
       0: iconst_0
       1: ireturn

  public boolean c();
    Code:
       0: iconst_1
       1: ireturn

  public boolean d();
    Code:
       0: iconst_0
       1: ireturn

  public boolean e();
    Code:
       0: iconst_0
       1: ireturn

  public void f();
    Code:
       0: aload_0
       1: aconst_null
       2: putfield      #32                 // Field c:Landroid/support/v4/view/c$b;
       5: aload_0
       6: aconst_null
       7: putfield      #29                 // Field b:Landroid/support/v4/view/c$a;
      10: return
}
