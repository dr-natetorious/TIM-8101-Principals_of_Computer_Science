class android.support.v4.view.PagerTitleStrip$a extends android.database.DataSetObserver implements android.support.v4.view.v$e,android.support.v4.view.v$f {
  final android.support.v4.view.PagerTitleStrip a;

  android.support.v4.view.PagerTitleStrip$a(android.support.v4.view.PagerTitleStrip);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
       5: aload_0
       6: invokespecial #21                 // Method android/database/DataSetObserver."<init>":()V
       9: return

  public void a(android.support.v4.view.v, android.support.v4.view.q, android.support.v4.view.q);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
       4: aload_2
       5: aload_3
       6: invokevirtual #26                 // Method android/support/v4/view/PagerTitleStrip.a:(Landroid/support/v4/view/q;Landroid/support/v4/view/q;)V
       9: return

  public void onChanged();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
       4: aload_0
       5: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
       8: getfield      #30                 // Field android/support/v4/view/PagerTitleStrip.a:Landroid/support/v4/view/v;
      11: invokevirtual #36                 // Method android/support/v4/view/v.getCurrentItem:()I
      14: aload_0
      15: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      18: getfield      #30                 // Field android/support/v4/view/PagerTitleStrip.a:Landroid/support/v4/view/v;
      21: invokevirtual #40                 // Method android/support/v4/view/v.getAdapter:()Landroid/support/v4/view/q;
      24: invokevirtual #43                 // Method android/support/v4/view/PagerTitleStrip.a:(ILandroid/support/v4/view/q;)V
      27: aload_0
      28: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      31: getfield      #47                 // Field android/support/v4/view/PagerTitleStrip.e:F
      34: fstore_2
      35: fconst_0
      36: fstore_1
      37: fload_2
      38: fconst_0
      39: fcmpl
      40: iflt          51
      43: aload_0
      44: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      47: getfield      #47                 // Field android/support/v4/view/PagerTitleStrip.e:F
      50: fstore_1
      51: aload_0
      52: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      55: aload_0
      56: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      59: getfield      #30                 // Field android/support/v4/view/PagerTitleStrip.a:Landroid/support/v4/view/v;
      62: invokevirtual #36                 // Method android/support/v4/view/v.getCurrentItem:()I
      65: fload_1
      66: iconst_1
      67: invokevirtual #50                 // Method android/support/v4/view/PagerTitleStrip.a:(IFZ)V
      70: return

  public void onPageScrollStateChanged(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #54                 // Field b:I
       5: return

  public void onPageScrolled(int, float, int);
    Code:
       0: iload_1
       1: istore_3
       2: fload_2
       3: ldc           #57                 // float 0.5f
       5: fcmpl
       6: ifle          13
       9: iload_1
      10: iconst_1
      11: iadd
      12: istore_3
      13: aload_0
      14: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      17: iload_3
      18: fload_2
      19: iconst_0
      20: invokevirtual #50                 // Method android/support/v4/view/PagerTitleStrip.a:(IFZ)V
      23: return

  public void onPageSelected(int);
    Code:
       0: aload_0
       1: getfield      #54                 // Field b:I
       4: ifne          77
       7: aload_0
       8: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      11: aload_0
      12: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      15: getfield      #30                 // Field android/support/v4/view/PagerTitleStrip.a:Landroid/support/v4/view/v;
      18: invokevirtual #36                 // Method android/support/v4/view/v.getCurrentItem:()I
      21: aload_0
      22: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      25: getfield      #30                 // Field android/support/v4/view/PagerTitleStrip.a:Landroid/support/v4/view/v;
      28: invokevirtual #40                 // Method android/support/v4/view/v.getAdapter:()Landroid/support/v4/view/q;
      31: invokevirtual #43                 // Method android/support/v4/view/PagerTitleStrip.a:(ILandroid/support/v4/view/q;)V
      34: aload_0
      35: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      38: getfield      #47                 // Field android/support/v4/view/PagerTitleStrip.e:F
      41: fstore_3
      42: fconst_0
      43: fstore_2
      44: fload_3
      45: fconst_0
      46: fcmpl
      47: iflt          58
      50: aload_0
      51: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      54: getfield      #47                 // Field android/support/v4/view/PagerTitleStrip.e:F
      57: fstore_2
      58: aload_0
      59: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      62: aload_0
      63: getfield      #18                 // Field a:Landroid/support/v4/view/PagerTitleStrip;
      66: getfield      #30                 // Field android/support/v4/view/PagerTitleStrip.a:Landroid/support/v4/view/v;
      69: invokevirtual #36                 // Method android/support/v4/view/v.getCurrentItem:()I
      72: fload_2
      73: iconst_1
      74: invokevirtual #50                 // Method android/support/v4/view/PagerTitleStrip.a:(IFZ)V
      77: return
}
