public class ryey.easer.core.ui.data.event.EditEventActivity extends ryey.easer.core.ui.data.b<ryey.easer.core.a.c, ryey.easer.core.a.a.c> {
  android.widget.EditText e;

  ryey.easer.core.ui.data.event.EventPluginViewPager f;

  public ryey.easer.core.ui.data.event.EditEventActivity();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method ryey/easer/core/ui/data/b."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #15                 // Field e:Landroid/widget/EditText;
       9: return

  protected ryey.easer.core.a.a.a a();
    Code:
       0: aload_0
       1: invokevirtual #22                 // Method g:()Lryey/easer/core/a/a/c;
       4: areturn

  protected void a(ryey.easer.core.a.c);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #28                 // Method ryey/easer/core/a/c.a:()Ljava/lang/String;
       5: putfield      #32                 // Field d:Ljava/lang/String;
       8: aload_0
       9: getfield      #15                 // Field e:Landroid/widget/EditText;
      12: aload_1
      13: invokevirtual #28                 // Method ryey/easer/core/a/c.a:()Ljava/lang/String;
      16: invokevirtual #38                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      19: aload_0
      20: getfield      #40                 // Field f:Lryey/easer/core/ui/data/event/EventPluginViewPager;
      23: aload_1
      24: invokevirtual #44                 // Method ryey/easer/core/a/c.c:()Lryey/easer/commons/local_plugin/eventplugin/EventData;
      27: invokevirtual #50                 // Method ryey/easer/core/ui/data/event/EventPluginViewPager.setEventData:(Lryey/easer/commons/local_plugin/eventplugin/EventData;)V
      30: return

  protected void a(ryey.easer.core.a.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #25                 // class ryey/easer/core/a/c
       5: invokevirtual #53                 // Method a:(Lryey/easer/core/a/c;)V
       8: return

  protected java.lang.String b();
    Code:
       0: aload_0
       1: ldc           #55                 // int 2131624304
       3: invokevirtual #59                 // Method getString:(I)Ljava/lang/String;
       6: areturn

  protected int c();
    Code:
       0: ldc           #61                 // int 2131427359
       2: ireturn

  protected void d();
    Code:
       0: aload_0
       1: aload_0
       2: ldc           #62                 // int 2131296388
       4: invokevirtual #66                 // Method findViewById:(I)Landroid/view/View;
       7: checkcast     #34                 // class android/widget/EditText
      10: putfield      #15                 // Field e:Landroid/widget/EditText;
      13: aload_0
      14: aload_0
      15: ldc           #67                 // int 2131296506
      17: invokevirtual #66                 // Method findViewById:(I)Landroid/view/View;
      20: checkcast     #46                 // class ryey/easer/core/ui/data/event/EventPluginViewPager
      23: putfield      #40                 // Field f:Lryey/easer/core/ui/data/event/EventPluginViewPager;
      26: aload_0
      27: getfield      #40                 // Field f:Lryey/easer/core/ui/data/event/EventPluginViewPager;
      30: aload_0
      31: invokevirtual #70                 // Method ryey/easer/core/ui/data/event/EventPluginViewPager.a:(Landroid/support/v7/app/e;)V
      34: return

  protected ryey.easer.core.a.f e();
    Code:
       0: aload_0
       1: invokevirtual #75                 // Method h:()Lryey/easer/core/a/c;
       4: areturn

  protected ryey.easer.core.a.a.c g();
    Code:
       0: new           #77                 // class ryey/easer/core/a/a/c
       3: dup
       4: aload_0
       5: invokespecial #80                 // Method ryey/easer/core/a/a/c."<init>":(Landroid/content/Context;)V
       8: areturn

  protected ryey.easer.core.a.c h();
    Code:
       0: aload_0
       1: getfield      #40                 // Field f:Lryey/easer/core/ui/data/event/EventPluginViewPager;
       4: invokevirtual #83                 // Method ryey/easer/core/ui/data/event/EventPluginViewPager.getEventData:()Lryey/easer/commons/local_plugin/eventplugin/EventData;
       7: astore_1
       8: new           #25                 // class ryey/easer/core/a/c
      11: dup
      12: iconst_m1
      13: aload_0
      14: getfield      #15                 // Field e:Landroid/widget/EditText;
      17: invokevirtual #87                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      20: invokevirtual #92                 // Method java/lang/Object.toString:()Ljava/lang/String;
      23: aload_1
      24: invokespecial #95                 // Method ryey/easer/core/a/c."<init>":(ILjava/lang/String;Lryey/easer/commons/local_plugin/eventplugin/EventData;)V
      27: areturn
}
