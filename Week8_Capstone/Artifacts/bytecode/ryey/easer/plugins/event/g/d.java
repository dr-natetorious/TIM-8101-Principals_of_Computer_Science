public class ryey.easer.plugins.event.g.d extends ryey.easer.plugins.c<ryey.easer.plugins.event.g.a> {
  java.lang.String[] a;

  final int[] b;

  final android.widget.CheckBox[] c;

  public ryey.easer.plugins.event.g.d();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method ryey/easer/plugins/c."<init>":()V
       4: aload_0
       5: bipush        6
       7: newarray       int
       9: dup
      10: iconst_0
      11: iconst_0
      12: iastore
      13: dup
      14: iconst_1
      15: bipush        10
      17: iastore
      18: dup
      19: iconst_2
      20: bipush        20
      22: iastore
      23: dup
      24: iconst_3
      25: bipush        30
      27: iastore
      28: dup
      29: iconst_4
      30: bipush        40
      32: iastore
      33: dup
      34: iconst_5
      35: bipush        100
      37: iastore
      38: putfield      #17                 // Field b:[I
      41: aload_0
      42: aload_0
      43: getfield      #17                 // Field b:[I
      46: arraylength
      47: anewarray     #19                 // class android/widget/CheckBox
      50: putfield      #21                 // Field c:[Landroid/widget/CheckBox;
      53: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #26                 // Method b:()Lryey/easer/plugins/event/g/a;
       4: areturn

  protected void a(ryey.easer.plugins.event.g.a);
    Code:
       0: aload_1
       1: getfield      #32                 // Field ryey/easer/plugins/event/g/a.a:Ljava/util/Set;
       4: invokeinterface #38,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       9: astore_1
      10: aload_1
      11: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          73
      19: aload_1
      20: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #50                 // class java/lang/Integer
      28: invokevirtual #54                 // Method java/lang/Integer.intValue:()I
      31: istore_3
      32: iconst_0
      33: istore_2
      34: iload_2
      35: aload_0
      36: getfield      #17                 // Field b:[I
      39: arraylength
      40: if_icmpge     10
      43: aload_0
      44: getfield      #17                 // Field b:[I
      47: iload_2
      48: iaload
      49: iload_3
      50: if_icmpne     66
      53: aload_0
      54: getfield      #21                 // Field c:[Landroid/widget/CheckBox;
      57: iload_2
      58: aaload
      59: iconst_1
      60: invokevirtual #58                 // Method android/widget/CheckBox.setChecked:(Z)V
      63: goto          10
      66: iload_2
      67: iconst_1
      68: iadd
      69: istore_2
      70: goto          34
      73: return

  public ryey.easer.plugins.event.g.a b();
    Code:
       0: new           #60                 // class android/support/v4/g/b
       3: dup
       4: invokespecial #61                 // Method android/support/v4/g/b."<init>":()V
       7: astore_2
       8: iconst_0
       9: istore_1
      10: iload_1
      11: aload_0
      12: getfield      #21                 // Field c:[Landroid/widget/CheckBox;
      15: arraylength
      16: if_icmpge     54
      19: aload_0
      20: getfield      #21                 // Field c:[Landroid/widget/CheckBox;
      23: iload_1
      24: aaload
      25: invokevirtual #64                 // Method android/widget/CheckBox.isChecked:()Z
      28: ifeq          47
      31: aload_2
      32: aload_0
      33: getfield      #17                 // Field b:[I
      36: iload_1
      37: iaload
      38: invokestatic  #68                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      41: invokeinterface #72,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      46: pop
      47: iload_1
      48: iconst_1
      49: iadd
      50: istore_1
      51: goto          10
      54: aload_2
      55: invokeinterface #75,  1           // InterfaceMethod java/util/Set.size:()I
      60: ifne          71
      63: new           #77                 // class ryey/easer/commons/local_plugin/c
      66: dup
      67: invokespecial #78                 // Method ryey/easer/commons/local_plugin/c."<init>":()V
      70: athrow
      71: new           #29                 // class ryey/easer/plugins/event/g/a
      74: dup
      75: aload_2
      76: invokespecial #81                 // Method ryey/easer/plugins/event/g/a."<init>":(Ljava/util/Set;)V
      79: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #29                 // class ryey/easer/plugins/event/g/a
       5: invokevirtual #84                 // Method a:(Lryey/easer/plugins/event/g/a;)V
       8: return

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #88                 // Method ryey/easer/plugins/c.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: aload_0
       7: invokevirtual #92                 // Method getResources:()Landroid/content/res/Resources;
      10: ldc           #93                 // int 2130903041
      12: invokevirtual #99                 // Method android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
      15: putfield      #101                // Field a:[Ljava/lang/String;
      18: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: new           #105                // class android/widget/LinearLayout
       3: dup
       4: aload_0
       5: invokevirtual #109                // Method getContext:()Landroid/content/Context;
       8: invokespecial #112                // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;)V
      11: astore_1
      12: aload_1
      13: iconst_1
      14: invokevirtual #116                // Method android/widget/LinearLayout.setOrientation:(I)V
      17: iconst_0
      18: istore        4
      20: iload         4
      22: aload_0
      23: getfield      #21                 // Field c:[Landroid/widget/CheckBox;
      26: arraylength
      27: if_icmpge     85
      30: aload_0
      31: getfield      #21                 // Field c:[Landroid/widget/CheckBox;
      34: iload         4
      36: new           #19                 // class android/widget/CheckBox
      39: dup
      40: aload_0
      41: invokevirtual #109                // Method getContext:()Landroid/content/Context;
      44: invokespecial #117                // Method android/widget/CheckBox."<init>":(Landroid/content/Context;)V
      47: aastore
      48: aload_0
      49: getfield      #21                 // Field c:[Landroid/widget/CheckBox;
      52: iload         4
      54: aaload
      55: aload_0
      56: getfield      #101                // Field a:[Ljava/lang/String;
      59: iload         4
      61: aaload
      62: invokevirtual #121                // Method android/widget/CheckBox.setText:(Ljava/lang/CharSequence;)V
      65: aload_1
      66: aload_0
      67: getfield      #21                 // Field c:[Landroid/widget/CheckBox;
      70: iload         4
      72: aaload
      73: invokevirtual #125                // Method android/widget/LinearLayout.addView:(Landroid/view/View;)V
      76: iload         4
      78: iconst_1
      79: iadd
      80: istore        4
      82: goto          20
      85: aload_1
      86: areturn
}
