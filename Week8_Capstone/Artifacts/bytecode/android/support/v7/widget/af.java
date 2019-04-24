class android.support.v7.widget.af implements android.support.v7.widget.ai {
  android.support.v7.widget.af();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method java/lang/Object."<init>":()V
       4: return

  public float a(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #25                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/bd;
       5: invokevirtual #28                 // Method android/support/v7/widget/bd.a:()F
       8: freturn

  public void a();
    Code:
       0: return

  public void a(android.support.v7.widget.ah, float);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #25                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/bd;
       5: fload_2
       6: invokevirtual #32                 // Method android/support/v7/widget/bd.a:(F)V
       9: return

  public void a(android.support.v7.widget.ah, android.content.Context, android.content.res.ColorStateList, float, float, float);
    Code:
       0: aload_1
       1: new           #21                 // class android/support/v7/widget/bd
       4: dup
       5: aload_3
       6: fload         4
       8: invokespecial #36                 // Method android/support/v7/widget/bd."<init>":(Landroid/content/res/ColorStateList;F)V
      11: invokeinterface #39,  2           // InterfaceMethod android/support/v7/widget/ah.a:(Landroid/graphics/drawable/Drawable;)V
      16: aload_1
      17: invokeinterface #43,  1           // InterfaceMethod android/support/v7/widget/ah.d:()Landroid/view/View;
      22: astore_2
      23: aload_2
      24: iconst_1
      25: invokevirtual #49                 // Method android/view/View.setClipToOutline:(Z)V
      28: aload_2
      29: fload         5
      31: invokevirtual #52                 // Method android/view/View.setElevation:(F)V
      34: aload_0
      35: aload_1
      36: fload         6
      38: invokevirtual #55                 // Method b:(Landroid/support/v7/widget/ah;F)V
      41: return

  public void a(android.support.v7.widget.ah, android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #25                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/bd;
       5: aload_2
       6: invokevirtual #59                 // Method android/support/v7/widget/bd.a:(Landroid/content/res/ColorStateList;)V
       9: return

  public float b(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #61                 // Method d:(Landroid/support/v7/widget/ah;)F
       5: fconst_2
       6: fmul
       7: freturn

  public void b(android.support.v7.widget.ah, float);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #25                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/bd;
       5: fload_2
       6: aload_1
       7: invokeinterface #64,  1           // InterfaceMethod android/support/v7/widget/ah.a:()Z
      12: aload_1
      13: invokeinterface #66,  1           // InterfaceMethod android/support/v7/widget/ah.b:()Z
      18: invokevirtual #69                 // Method android/support/v7/widget/bd.a:(FZZ)V
      21: aload_0
      22: aload_1
      23: invokevirtual #73                 // Method f:(Landroid/support/v7/widget/ah;)V
      26: return

  public float c(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #61                 // Method d:(Landroid/support/v7/widget/ah;)F
       5: fconst_2
       6: fmul
       7: freturn

  public void c(android.support.v7.widget.ah, float);
    Code:
       0: aload_1
       1: invokeinterface #43,  1           // InterfaceMethod android/support/v7/widget/ah.d:()Landroid/view/View;
       6: fload_2
       7: invokevirtual #52                 // Method android/view/View.setElevation:(F)V
      10: return

  public float d(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #25                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/bd;
       5: invokevirtual #75                 // Method android/support/v7/widget/bd.b:()F
       8: freturn

  public float e(android.support.v7.widget.ah);
    Code:
       0: aload_1
       1: invokeinterface #43,  1           // InterfaceMethod android/support/v7/widget/ah.d:()Landroid/view/View;
       6: invokevirtual #79                 // Method android/view/View.getElevation:()F
       9: freturn

  public void f(android.support.v7.widget.ah);
    Code:
       0: aload_1
       1: invokeinterface #64,  1           // InterfaceMethod android/support/v7/widget/ah.a:()Z
       6: ifne          20
       9: aload_1
      10: iconst_0
      11: iconst_0
      12: iconst_0
      13: iconst_0
      14: invokeinterface #82,  5           // InterfaceMethod android/support/v7/widget/ah.a:(IIII)V
      19: return
      20: aload_0
      21: aload_1
      22: invokevirtual #84                 // Method a:(Landroid/support/v7/widget/ah;)F
      25: fstore_2
      26: aload_0
      27: aload_1
      28: invokevirtual #61                 // Method d:(Landroid/support/v7/widget/ah;)F
      31: fstore_3
      32: fload_2
      33: fload_3
      34: aload_1
      35: invokeinterface #66,  1           // InterfaceMethod android/support/v7/widget/ah.b:()Z
      40: invokestatic  #89                 // Method android/support/v7/widget/be.b:(FFZ)F
      43: f2d
      44: invokestatic  #95                 // Method java/lang/Math.ceil:(D)D
      47: d2i
      48: istore        4
      50: fload_2
      51: fload_3
      52: aload_1
      53: invokeinterface #66,  1           // InterfaceMethod android/support/v7/widget/ah.b:()Z
      58: invokestatic  #97                 // Method android/support/v7/widget/be.a:(FFZ)F
      61: f2d
      62: invokestatic  #95                 // Method java/lang/Math.ceil:(D)D
      65: d2i
      66: istore        5
      68: aload_1
      69: iload         4
      71: iload         5
      73: iload         4
      75: iload         5
      77: invokeinterface #82,  5           // InterfaceMethod android/support/v7/widget/ah.a:(IIII)V
      82: return

  public void g(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: aload_0
       3: aload_1
       4: invokevirtual #84                 // Method a:(Landroid/support/v7/widget/ah;)F
       7: invokevirtual #55                 // Method b:(Landroid/support/v7/widget/ah;F)V
      10: return

  public void h(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: aload_0
       3: aload_1
       4: invokevirtual #84                 // Method a:(Landroid/support/v7/widget/ah;)F
       7: invokevirtual #55                 // Method b:(Landroid/support/v7/widget/ah;F)V
      10: return

  public android.content.res.ColorStateList i(android.support.v7.widget.ah);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #25                 // Method j:(Landroid/support/v7/widget/ah;)Landroid/support/v7/widget/bd;
       5: invokevirtual #104                // Method android/support/v7/widget/bd.c:()Landroid/content/res/ColorStateList;
       8: areturn
}
