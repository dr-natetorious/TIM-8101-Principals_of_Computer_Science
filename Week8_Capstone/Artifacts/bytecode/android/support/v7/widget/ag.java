class android.support.v7.widget.ag implements android.support.v7.widget.ai {
  android.support.v7.widget.ag();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #16                 // class android/graphics/RectF
       8: dup
       9: invokespecial #17                 // Method android/graphics/RectF."<init>":()V
      12: putfield      #19                 // Field a:Landroid/graphics/RectF;
      15: return

  static android.graphics.RectF a(android.support.v7.widget.ag);
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/graphics/RectF;
       4: areturn

  public float a(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: invokevirtual #47                 // Method android/support/v7/widget/be.c:()F
       8: freturn

  public void a();
    Code:
       0: new           #8                  // class android/support/v7/widget/ag$1
       3: dup
       4: aload_0
       5: invokespecial #50                 // Method android/support/v7/widget/ag$1."<init>":(Landroid/support/v7/widget/ag;)V
       8: putstatic     #53                 // Field android/support/v7/widget/be.a:Landroid/support/v7/widget/be$a;
      11: return

  public void a(android.support.v7.widget.ah, float);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: fload_2
       6: invokevirtual #57                 // Method android/support/v7/widget/be.a:(F)V
       9: aload_0
      10: aload_1
      11: invokevirtual #61                 // Method f:(Landroid/support/v7/widget/ah;)V
      14: return

  public void a(android.support.v7.widget.ah, android.content.Context, android.content.res.ColorStateList, float, float, float);
    Code:
       0: aload_0
       1: aload_2
       2: aload_3
       3: fload         4
       5: fload         5
       7: fload         6
       9: invokespecial #64                 // Method a:(Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)Landroid/support/v7/widget/be;
      12: astore_2
      13: aload_2
      14: aload_1
      15: invokeinterface #68,  1           // InterfaceMethod android/support/v7/widget/ah.b:()Z
      20: invokevirtual #71                 // Method android/support/v7/widget/be.a:(Z)V
      23: aload_1
      24: aload_2
      25: invokeinterface #74,  2           // InterfaceMethod android/support/v7/widget/ah.a:(Landroid/graphics/drawable/Drawable;)V
      30: aload_0
      31: aload_1
      32: invokevirtual #61                 // Method f:(Landroid/support/v7/widget/ah;)V
      35: return

  public void a(android.support.v7.widget.ah, android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: aload_2
       6: invokevirtual #78                 // Method android/support/v7/widget/be.a:(Landroid/content/res/ColorStateList;)V
       9: return

  public float b(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: invokevirtual #81                 // Method android/support/v7/widget/be.d:()F
       8: freturn

  public void b(android.support.v7.widget.ah, float);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: fload_2
       6: invokevirtual #83                 // Method android/support/v7/widget/be.c:(F)V
       9: aload_0
      10: aload_1
      11: invokevirtual #61                 // Method f:(Landroid/support/v7/widget/ah;)V
      14: return

  public float c(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: invokevirtual #86                 // Method android/support/v7/widget/be.e:()F
       8: freturn

  public void c(android.support.v7.widget.ah, float);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: fload_2
       6: invokevirtual #88                 // Method android/support/v7/widget/be.b:(F)V
       9: return

  public float d(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: invokevirtual #90                 // Method android/support/v7/widget/be.a:()F
       8: freturn

  public float e(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: invokevirtual #92                 // Method android/support/v7/widget/be.b:()F
       8: freturn

  public void f(android.support.v7.widget.ah);
    Code:
       0: new           #94                 // class android/graphics/Rect
       3: dup
       4: invokespecial #95                 // Method android/graphics/Rect."<init>":()V
       7: astore_2
       8: aload_0
       9: aload_1
      10: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
      13: aload_2
      14: invokevirtual #98                 // Method android/support/v7/widget/be.a:(Landroid/graphics/Rect;)V
      17: aload_1
      18: aload_0
      19: aload_1
      20: invokevirtual #100                // Method b:(Landroid/support/v7/widget/ah;)F
      23: f2d
      24: invokestatic  #106                // Method java/lang/Math.ceil:(D)D
      27: d2i
      28: aload_0
      29: aload_1
      30: invokevirtual #108                // Method c:(Landroid/support/v7/widget/ah;)F
      33: f2d
      34: invokestatic  #106                // Method java/lang/Math.ceil:(D)D
      37: d2i
      38: invokeinterface #111,  3          // InterfaceMethod android/support/v7/widget/ah.a:(II)V
      43: aload_1
      44: aload_2
      45: getfield      #115                // Field android/graphics/Rect.left:I
      48: aload_2
      49: getfield      #118                // Field android/graphics/Rect.top:I
      52: aload_2
      53: getfield      #121                // Field android/graphics/Rect.right:I
      56: aload_2
      57: getfield      #124                // Field android/graphics/Rect.bottom:I
      60: invokeinterface #127,  5          // InterfaceMethod android/support/v7/widget/ah.a:(IIII)V
      65: return

  public void g(android.support.v7.widget.ah);
    Code:
       0: return

  public void h(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: aload_1
       6: invokeinterface #68,  1           // InterfaceMethod android/support/v7/widget/ah.b:()Z
      11: invokevirtual #71                 // Method android/support/v7/widget/be.a:(Z)V
      14: aload_0
      15: aload_1
      16: invokevirtual #61                 // Method f:(Landroid/support/v7/widget/ah;)V
      19: return

  public android.content.res.ColorStateList i(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/be;
       5: invokevirtual #134                // Method android/support/v7/widget/be.f:()Landroid/content/res/ColorStateList;
       8: areturn
}
