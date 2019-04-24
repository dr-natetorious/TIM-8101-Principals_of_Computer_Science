public class android.support.v7.view.d extends android.content.ContextWrapper {
  public android.support.v7.view.d();
    Code:
       0: aload_0
       1: aconst_null
       2: invokespecial #19                 // Method android/content/ContextWrapper."<init>":(Landroid/content/Context;)V
       5: return

  public android.support.v7.view.d(android.content.Context, int);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #19                 // Method android/content/ContextWrapper."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: iload_2
       7: putfield      #23                 // Field a:I
      10: return

  public android.support.v7.view.d(android.content.Context, android.content.res.Resources$Theme);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #19                 // Method android/content/ContextWrapper."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: aload_2
       7: putfield      #26                 // Field b:Landroid/content/res/Resources$Theme;
      10: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:I
       4: ireturn

  protected void a(android.content.res.Resources$Theme, int, boolean);
    Code:
       0: aload_1
       1: iload_2
       2: iconst_1
       3: invokevirtual #74                 // Method android/content/res/Resources$Theme.applyStyle:(IZ)V
       6: return

  protected void attachBaseContext(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #77                 // Method android/content/ContextWrapper.attachBaseContext:(Landroid/content/Context;)V
       5: return

  public android.content.res.AssetManager getAssets();
    Code:
       0: aload_0
       1: invokevirtual #47                 // Method getResources:()Landroid/content/res/Resources;
       4: invokevirtual #81                 // Method android/content/res/Resources.getAssets:()Landroid/content/res/AssetManager;
       7: areturn

  public android.content.res.Resources getResources();
    Code:
       0: aload_0
       1: invokespecial #83                 // Method b:()Landroid/content/res/Resources;
       4: areturn

  public java.lang.Object getSystemService(java.lang.String);
    Code:
       0: ldc           #87                 // String layout_inflater
       2: aload_1
       3: invokevirtual #93                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       6: ifeq          36
       9: aload_0
      10: getfield      #95                 // Field c:Landroid/view/LayoutInflater;
      13: ifnonnull     31
      16: aload_0
      17: aload_0
      18: invokevirtual #57                 // Method getBaseContext:()Landroid/content/Context;
      21: invokestatic  #101                // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      24: aload_0
      25: invokevirtual #104                // Method android/view/LayoutInflater.cloneInContext:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      28: putfield      #95                 // Field c:Landroid/view/LayoutInflater;
      31: aload_0
      32: getfield      #95                 // Field c:Landroid/view/LayoutInflater;
      35: areturn
      36: aload_0
      37: invokevirtual #57                 // Method getBaseContext:()Landroid/content/Context;
      40: aload_1
      41: invokevirtual #106                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      44: areturn

  public android.content.res.Resources$Theme getTheme();
    Code:
       0: aload_0
       1: getfield      #26                 // Field b:Landroid/content/res/Resources$Theme;
       4: ifnull        12
       7: aload_0
       8: getfield      #26                 // Field b:Landroid/content/res/Resources$Theme;
      11: areturn
      12: aload_0
      13: getfield      #23                 // Field a:I
      16: ifne          26
      19: aload_0
      20: getstatic     #111                // Field android/support/v7/a/a$i.Theme_AppCompat_Light:I
      23: putfield      #23                 // Field a:I
      26: aload_0
      27: invokespecial #113                // Method c:()V
      30: aload_0
      31: getfield      #26                 // Field b:Landroid/content/res/Resources$Theme;
      34: areturn

  public void setTheme(int);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:I
       4: iload_1
       5: if_icmpeq     17
       8: aload_0
       9: iload_1
      10: putfield      #23                 // Field a:I
      13: aload_0
      14: invokespecial #113                // Method c:()V
      17: return
}
