abstract class android.support.v4.app.e extends android.support.v4.app.aj {
  boolean mStartedIntentSenderFromFragment;

  android.support.v4.app.e();
    Code:
       0: aload_0
       1: invokespecial #10                 // Method android/support/v4/app/aj."<init>":()V
       4: return

  static void checkForValidRequestCode(int);
    Code:
       0: iload_0
       1: ldc           #14                 // int -65536
       3: iand
       4: ifeq          17
       7: new           #16                 // class java/lang/IllegalArgumentException
      10: dup
      11: ldc           #18                 // String Can only use lower 16 bits for requestCode
      13: invokespecial #21                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: return

  abstract android.view.View dispatchFragmentsOnCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet);

  public android.view.View onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: invokevirtual #26                 // Method dispatchFragmentsOnCreateView:(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
       9: astore        5
      11: aload         5
      13: ifnonnull     26
      16: aload_0
      17: aload_1
      18: aload_2
      19: aload_3
      20: aload         4
      22: invokespecial #28                 // Method android/support/v4/app/aj.onCreateView:(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
      25: areturn
      26: aload         5
      28: areturn

  public android.view.View onCreateView(java.lang.String, android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aconst_null
       2: aload_1
       3: aload_2
       4: aload_3
       5: invokevirtual #26                 // Method dispatchFragmentsOnCreateView:(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
       8: astore        4
      10: aload         4
      12: ifnonnull     23
      15: aload_0
      16: aload_1
      17: aload_2
      18: aload_3
      19: invokespecial #31                 // Method android/support/v4/app/aj.onCreateView:(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
      22: areturn
      23: aload         4
      25: areturn

  public void startIntentSenderForResult(android.content.IntentSender, int, android.content.Intent, int, int, int);
    Code:
       0: aload_0
       1: getfield      #35                 // Field mStartedIntentSenderFromFragment:Z
       4: ifne          16
       7: iload_2
       8: iconst_m1
       9: if_icmpeq     16
      12: iload_2
      13: invokestatic  #37                 // Method checkForValidRequestCode:(I)V
      16: aload_0
      17: aload_1
      18: iload_2
      19: aload_3
      20: iload         4
      22: iload         5
      24: iload         6
      26: invokespecial #39                 // Method android/support/v4/app/aj.startIntentSenderForResult:(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
      29: return
}
