class android.support.v7.widget.b extends android.graphics.drawable.Drawable {
  final android.support.v7.widget.ActionBarContainer a;

  public android.support.v7.widget.b(android.support.v7.widget.ActionBarContainer);
    Code:
       0: aload_0
       1: invokespecial #11                 // Method android/graphics/drawable/Drawable."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #13                 // Field a:Landroid/support/v7/widget/ActionBarContainer;
       9: return

  public void draw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/widget/ActionBarContainer;
       4: getfield      #22                 // Field android/support/v7/widget/ActionBarContainer.d:Z
       7: ifeq          34
      10: aload_0
      11: getfield      #13                 // Field a:Landroid/support/v7/widget/ActionBarContainer;
      14: getfield      #26                 // Field android/support/v7/widget/ActionBarContainer.c:Landroid/graphics/drawable/Drawable;
      17: ifnull        86
      20: aload_0
      21: getfield      #13                 // Field a:Landroid/support/v7/widget/ActionBarContainer;
      24: getfield      #26                 // Field android/support/v7/widget/ActionBarContainer.c:Landroid/graphics/drawable/Drawable;
      27: astore_2
      28: aload_2
      29: aload_1
      30: invokevirtual #28                 // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
      33: return
      34: aload_0
      35: getfield      #13                 // Field a:Landroid/support/v7/widget/ActionBarContainer;
      38: getfield      #30                 // Field android/support/v7/widget/ActionBarContainer.a:Landroid/graphics/drawable/Drawable;
      41: ifnull        55
      44: aload_0
      45: getfield      #13                 // Field a:Landroid/support/v7/widget/ActionBarContainer;
      48: getfield      #30                 // Field android/support/v7/widget/ActionBarContainer.a:Landroid/graphics/drawable/Drawable;
      51: aload_1
      52: invokevirtual #28                 // Method android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
      55: aload_0
      56: getfield      #13                 // Field a:Landroid/support/v7/widget/ActionBarContainer;
      59: getfield      #33                 // Field android/support/v7/widget/ActionBarContainer.b:Landroid/graphics/drawable/Drawable;
      62: ifnull        86
      65: aload_0
      66: getfield      #13                 // Field a:Landroid/support/v7/widget/ActionBarContainer;
      69: getfield      #36                 // Field android/support/v7/widget/ActionBarContainer.e:Z
      72: ifeq          86
      75: aload_0
      76: getfield      #13                 // Field a:Landroid/support/v7/widget/ActionBarContainer;
      79: getfield      #33                 // Field android/support/v7/widget/ActionBarContainer.b:Landroid/graphics/drawable/Drawable;
      82: astore_2
      83: goto          28
      86: return

  public int getOpacity();
    Code:
       0: iconst_0
       1: ireturn

  public void setAlpha(int);
    Code:
       0: return

  public void setColorFilter(android.graphics.ColorFilter);
    Code:
       0: return
}
