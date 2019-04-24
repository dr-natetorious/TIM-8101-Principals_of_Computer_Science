public class ryey.easer.plugins.event.a.d extends ryey.easer.plugins.c<ryey.easer.plugins.event.a.a> {
  java.lang.String[] a;

  final int[] b;

  final android.widget.RadioButton[] c;

  public ryey.easer.plugins.event.a.d();
    Code:
       0: aload_0
       1: invokespecial #19                 // Method ryey/easer/plugins/c."<init>":()V
       4: aload_0
       5: iconst_2
       6: newarray       int
       8: dup
       9: iconst_0
      10: iconst_0
      11: iastore
      12: dup
      13: iconst_1
      14: iconst_2
      15: iastore
      16: putfield      #21                 // Field b:[I
      19: aload_0
      20: aload_0
      21: getfield      #21                 // Field b:[I
      24: arraylength
      25: anewarray     #23                 // class android/widget/RadioButton
      28: putfield      #25                 // Field c:[Landroid/widget/RadioButton;
      31: aload_0
      32: aconst_null
      33: putfield      #27                 // Field d:Ljava/lang/Integer;
      36: return

  static java.lang.Integer a(ryey.easer.plugins.event.a.d, java.lang.Integer);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #27                 // Field d:Ljava/lang/Integer;
       5: aload_1
       6: areturn

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #33                 // Method b:()Lryey/easer/plugins/event/a/a;
       4: areturn

  protected void a(ryey.easer.plugins.event.a.a);
    Code:
       0: aload_1
       1: getfield      #38                 // Field ryey/easer/plugins/event/a/a.a:Ljava/lang/Integer;
       4: invokevirtual #44                 // Method java/lang/Integer.intValue:()I
       7: istore_3
       8: iconst_0
       9: istore_2
      10: iload_2
      11: aload_0
      12: getfield      #21                 // Field b:[I
      15: arraylength
      16: if_icmpge     54
      19: aload_0
      20: getfield      #21                 // Field b:[I
      23: iload_2
      24: iaload
      25: iload_3
      26: if_icmpne     47
      29: aload_0
      30: getfield      #25                 // Field c:[Landroid/widget/RadioButton;
      33: iload_2
      34: aaload
      35: iconst_1
      36: invokevirtual #48                 // Method android/widget/RadioButton.setChecked:(Z)V
      39: aload_0
      40: iload_2
      41: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      44: putfield      #27                 // Field d:Ljava/lang/Integer;
      47: iload_2
      48: iconst_1
      49: iadd
      50: istore_2
      51: goto          10
      54: return

  public ryey.easer.plugins.event.a.a b();
    Code:
       0: aload_0
       1: getfield      #27                 // Field d:Ljava/lang/Integer;
       4: ifnonnull     15
       7: new           #54                 // class ryey/easer/commons/local_plugin/c
      10: dup
      11: invokespecial #55                 // Method ryey/easer/commons/local_plugin/c."<init>":()V
      14: athrow
      15: new           #36                 // class ryey/easer/plugins/event/a/a
      18: dup
      19: aload_0
      20: getfield      #21                 // Field b:[I
      23: aload_0
      24: getfield      #27                 // Field d:Ljava/lang/Integer;
      27: invokevirtual #44                 // Method java/lang/Integer.intValue:()I
      30: iaload
      31: invokestatic  #52                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      34: invokespecial #58                 // Method ryey/easer/plugins/event/a/a."<init>":(Ljava/lang/Integer;)V
      37: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #36                 // class ryey/easer/plugins/event/a/a
       5: invokevirtual #61                 // Method a:(Lryey/easer/plugins/event/a/a;)V
       8: return

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #65                 // Method ryey/easer/plugins/c.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: aload_0
       7: invokevirtual #69                 // Method getResources:()Landroid/content/res/Resources;
      10: ldc           #70                 // int 2130903040
      12: invokevirtual #76                 // Method android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
      15: putfield      #78                 // Field a:[Ljava/lang/String;
      18: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: new           #82                 // class android/widget/RadioGroup
       3: dup
       4: aload_0
       5: invokevirtual #86                 // Method getContext:()Landroid/content/Context;
       8: invokespecial #89                 // Method android/widget/RadioGroup."<init>":(Landroid/content/Context;)V
      11: astore_1
      12: iconst_0
      13: istore        4
      15: aload_1
      16: iconst_0
      17: invokevirtual #93                 // Method android/widget/RadioGroup.setOrientation:(I)V
      20: new           #7                  // class ryey/easer/plugins/event/a/d$1
      23: dup
      24: aload_0
      25: invokespecial #96                 // Method ryey/easer/plugins/event/a/d$1."<init>":(Lryey/easer/plugins/event/a/d;)V
      28: astore_2
      29: iload         4
      31: aload_0
      32: getfield      #25                 // Field c:[Landroid/widget/RadioButton;
      35: arraylength
      36: if_icmpge     105
      39: aload_0
      40: getfield      #25                 // Field c:[Landroid/widget/RadioButton;
      43: iload         4
      45: new           #23                 // class android/widget/RadioButton
      48: dup
      49: aload_0
      50: invokevirtual #86                 // Method getContext:()Landroid/content/Context;
      53: invokespecial #97                 // Method android/widget/RadioButton."<init>":(Landroid/content/Context;)V
      56: aastore
      57: aload_0
      58: getfield      #25                 // Field c:[Landroid/widget/RadioButton;
      61: iload         4
      63: aaload
      64: aload_0
      65: getfield      #78                 // Field a:[Ljava/lang/String;
      68: iload         4
      70: aaload
      71: invokevirtual #101                // Method android/widget/RadioButton.setText:(Ljava/lang/CharSequence;)V
      74: aload_0
      75: getfield      #25                 // Field c:[Landroid/widget/RadioButton;
      78: iload         4
      80: aaload
      81: aload_2
      82: invokevirtual #105                // Method android/widget/RadioButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      85: aload_1
      86: aload_0
      87: getfield      #25                 // Field c:[Landroid/widget/RadioButton;
      90: iload         4
      92: aaload
      93: invokevirtual #109                // Method android/widget/RadioGroup.addView:(Landroid/view/View;)V
      96: iload         4
      98: iconst_1
      99: iadd
     100: istore        4
     102: goto          29
     105: aload_1
     106: areturn
}
