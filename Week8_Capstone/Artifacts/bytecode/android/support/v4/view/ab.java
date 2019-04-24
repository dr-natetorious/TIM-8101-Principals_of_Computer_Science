public class android.support.v4.view.ab {
  static android.support.v4.view.ab a(java.lang.Object);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: new           #2                  // class android/support/v4/view/ab
       9: dup
      10: aload_0
      11: invokespecial #17                 // Method "<init>":(Ljava/lang/Object;)V
      14: areturn

  static java.lang.Object a(android.support.v4.view.ab);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: aload_0
       7: getfield      #13                 // Field a:Ljava/lang/Object;
      10: areturn

  public int a();
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        20
       5: if_icmplt     19
       8: aload_0
       9: getfield      #13                 // Field a:Ljava/lang/Object;
      12: checkcast     #27                 // class android/view/WindowInsets
      15: invokevirtual #30                 // Method android/view/WindowInsets.getSystemWindowInsetLeft:()I
      18: ireturn
      19: iconst_0
      20: ireturn

  public android.support.v4.view.ab a(int, int, int, int);
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        20
       5: if_icmplt     31
       8: new           #2                  // class android/support/v4/view/ab
      11: dup
      12: aload_0
      13: getfield      #13                 // Field a:Ljava/lang/Object;
      16: checkcast     #27                 // class android/view/WindowInsets
      19: iload_1
      20: iload_2
      21: iload_3
      22: iload         4
      24: invokevirtual #35                 // Method android/view/WindowInsets.replaceSystemWindowInsets:(IIII)Landroid/view/WindowInsets;
      27: invokespecial #17                 // Method "<init>":(Ljava/lang/Object;)V
      30: areturn
      31: aconst_null
      32: areturn

  public int b();
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        20
       5: if_icmplt     19
       8: aload_0
       9: getfield      #13                 // Field a:Ljava/lang/Object;
      12: checkcast     #27                 // class android/view/WindowInsets
      15: invokevirtual #39                 // Method android/view/WindowInsets.getSystemWindowInsetTop:()I
      18: ireturn
      19: iconst_0
      20: ireturn

  public int c();
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        20
       5: if_icmplt     19
       8: aload_0
       9: getfield      #13                 // Field a:Ljava/lang/Object;
      12: checkcast     #27                 // class android/view/WindowInsets
      15: invokevirtual #43                 // Method android/view/WindowInsets.getSystemWindowInsetRight:()I
      18: ireturn
      19: iconst_0
      20: ireturn

  public int d();
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        20
       5: if_icmplt     19
       8: aload_0
       9: getfield      #13                 // Field a:Ljava/lang/Object;
      12: checkcast     #27                 // class android/view/WindowInsets
      15: invokevirtual #47                 // Method android/view/WindowInsets.getSystemWindowInsetBottom:()I
      18: ireturn
      19: iconst_0
      20: ireturn

  public boolean e();
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        20
       5: if_icmplt     19
       8: aload_0
       9: getfield      #13                 // Field a:Ljava/lang/Object;
      12: checkcast     #27                 // class android/view/WindowInsets
      15: invokevirtual #52                 // Method android/view/WindowInsets.hasSystemWindowInsets:()Z
      18: ireturn
      19: iconst_0
      20: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnull        59
      11: aload_0
      12: invokevirtual #58                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      15: aload_1
      16: invokevirtual #58                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      19: if_acmpeq     24
      22: iconst_0
      23: ireturn
      24: aload_1
      25: checkcast     #2                  // class android/support/v4/view/ab
      28: astore_1
      29: aload_0
      30: getfield      #13                 // Field a:Ljava/lang/Object;
      33: ifnonnull     47
      36: aload_1
      37: getfield      #13                 // Field a:Ljava/lang/Object;
      40: ifnonnull     45
      43: iconst_1
      44: ireturn
      45: iconst_0
      46: ireturn
      47: aload_0
      48: getfield      #13                 // Field a:Ljava/lang/Object;
      51: aload_1
      52: getfield      #13                 // Field a:Ljava/lang/Object;
      55: invokevirtual #60                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      58: ireturn
      59: iconst_0
      60: ireturn

  public boolean f();
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     19
       8: aload_0
       9: getfield      #13                 // Field a:Ljava/lang/Object;
      12: checkcast     #27                 // class android/view/WindowInsets
      15: invokevirtual #64                 // Method android/view/WindowInsets.isConsumed:()Z
      18: ireturn
      19: iconst_0
      20: ireturn

  public android.support.v4.view.ab g();
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        20
       5: if_icmplt     26
       8: new           #2                  // class android/support/v4/view/ab
      11: dup
      12: aload_0
      13: getfield      #13                 // Field a:Ljava/lang/Object;
      16: checkcast     #27                 // class android/view/WindowInsets
      19: invokevirtual #70                 // Method android/view/WindowInsets.consumeSystemWindowInsets:()Landroid/view/WindowInsets;
      22: invokespecial #17                 // Method "<init>":(Ljava/lang/Object;)V
      25: areturn
      26: aconst_null
      27: areturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Ljava/lang/Object;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #13                 // Field a:Ljava/lang/Object;
      13: invokevirtual #73                 // Method java/lang/Object.hashCode:()I
      16: ireturn
}
