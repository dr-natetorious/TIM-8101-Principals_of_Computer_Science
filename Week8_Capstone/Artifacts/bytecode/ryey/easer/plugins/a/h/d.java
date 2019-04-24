public class ryey.easer.plugins.a.h.d extends ryey.easer.plugins.c<ryey.easer.plugins.a.h.a> {
  static {};
    Code:
       0: iconst_2
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #14                 // int 2131296544
       7: iastore
       8: dup
       9: iconst_1
      10: ldc           #15                 // int 2131296545
      12: iastore
      13: putstatic     #17                 // Field a:[I
      16: iconst_3
      17: newarray       int
      19: dup
      20: iconst_0
      21: ldc           #18                 // int 2131296535
      23: iastore
      24: dup
      25: iconst_1
      26: ldc           #19                 // int 2131296534
      28: iastore
      29: dup
      30: iconst_2
      31: ldc           #20                 // int 2131296533
      33: iastore
      34: putstatic     #22                 // Field b:[I
      37: return

  public ryey.easer.plugins.a.h.d();
    Code:
       0: aload_0
       1: invokespecial #26                 // Method ryey/easer/plugins/c."<init>":()V
       4: aload_0
       5: getstatic     #17                 // Field a:[I
       8: arraylength
       9: anewarray     #28                 // class android/widget/RadioButton
      12: putfield      #30                 // Field c:[Landroid/widget/RadioButton;
      15: aload_0
      16: getstatic     #22                 // Field b:[I
      19: arraylength
      20: anewarray     #28                 // class android/widget/RadioButton
      23: putfield      #32                 // Field d:[Landroid/widget/RadioButton;
      26: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #36                 // Method b:()Lryey/easer/plugins/a/h/a;
       4: areturn

  protected void a(ryey.easer.plugins.a.h.a);
    Code:
       0: aload_0
       1: getfield      #30                 // Field c:[Landroid/widget/RadioButton;
       4: aload_1
       5: getfield      #42                 // Field ryey/easer/plugins/a/h/a.a:Lryey/easer/plugins/a/h/a$a;
       8: invokevirtual #48                 // Method ryey/easer/plugins/a/h/a$a.ordinal:()I
      11: aaload
      12: iconst_1
      13: invokevirtual #52                 // Method android/widget/RadioButton.setChecked:(Z)V
      16: aload_0
      17: getfield      #32                 // Field d:[Landroid/widget/RadioButton;
      20: aload_1
      21: getfield      #55                 // Field ryey/easer/plugins/a/h/a.b:Lryey/easer/plugins/a/h/a$b;
      24: invokevirtual #58                 // Method ryey/easer/plugins/a/h/a$b.ordinal:()I
      27: aaload
      28: iconst_1
      29: invokevirtual #52                 // Method android/widget/RadioButton.setChecked:(Z)V
      32: return

  public ryey.easer.plugins.a.h.a b();
    Code:
       0: new           #39                 // class ryey/easer/plugins/a/h/a
       3: dup
       4: invokestatic  #62                 // Method ryey/easer/plugins/a/h/a$a.values:()[Lryey/easer/plugins/a/h/a$a;
       7: aload_0
       8: getfield      #30                 // Field c:[Landroid/widget/RadioButton;
      11: invokestatic  #67                 // Method ryey/easer/b.a:([Landroid/widget/CompoundButton;)I
      14: aaload
      15: invokestatic  #70                 // Method ryey/easer/plugins/a/h/a$b.values:()[Lryey/easer/plugins/a/h/a$b;
      18: aload_0
      19: getfield      #32                 // Field d:[Landroid/widget/RadioButton;
      22: invokestatic  #67                 // Method ryey/easer/b.a:([Landroid/widget/CompoundButton;)I
      25: aaload
      26: invokespecial #73                 // Method ryey/easer/plugins/a/h/a."<init>":(Lryey/easer/plugins/a/h/a$a;Lryey/easer/plugins/a/h/a$b;)V
      29: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #39                 // class ryey/easer/plugins/a/h/a
       5: invokevirtual #76                 // Method a:(Lryey/easer/plugins/a/h/a;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: iconst_0
       1: istore        6
       3: aload_1
       4: ldc           #79                 // int 2131427436
       6: aload_2
       7: iconst_0
       8: invokevirtual #85                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      11: astore_1
      12: iconst_0
      13: istore        4
      15: iload         6
      17: istore        5
      19: iload         4
      21: getstatic     #17                 // Field a:[I
      24: arraylength
      25: if_icmpge     57
      28: aload_0
      29: getfield      #30                 // Field c:[Landroid/widget/RadioButton;
      32: iload         4
      34: aload_1
      35: getstatic     #17                 // Field a:[I
      38: iload         4
      40: iaload
      41: invokevirtual #91                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      44: checkcast     #28                 // class android/widget/RadioButton
      47: aastore
      48: iload         4
      50: iconst_1
      51: iadd
      52: istore        4
      54: goto          15
      57: iload         5
      59: getstatic     #22                 // Field b:[I
      62: arraylength
      63: if_icmpge     95
      66: aload_0
      67: getfield      #32                 // Field d:[Landroid/widget/RadioButton;
      70: iload         5
      72: aload_1
      73: getstatic     #22                 // Field b:[I
      76: iload         5
      78: iaload
      79: invokevirtual #91                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      82: checkcast     #28                 // class android/widget/RadioButton
      85: aastore
      86: iload         5
      88: iconst_1
      89: iadd
      90: istore        5
      92: goto          57
      95: aload_1
      96: areturn
}
