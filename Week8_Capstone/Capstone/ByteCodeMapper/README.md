# Find the starting node

graph.traversal().V('org.smssecure.smssecure.service.QuickResponseService')

# Find the tail node

graph.traversal().V('org.smssecure.smssecure.sms.MessageSender').outE().inV().hasId('org.smssecure.smssecure.sms.MessageSender.send').outE().inV().hasId('org.smssecure.smssecure.sms.MessageSender.sendMediaMessage').

graph.traversal().V('org.smssecure.smssecure.sms.MessageSender.sendTextMessage').outE().inV().hasId('org.smssecure.smssecure.jobs.SmsSendJob.ctr')

graph.traversal().V('org.smssecure.smssecure.sms.MessageSender.sendTextMessage').outE().inV().hasId('org.smssecure.smssecure.jobs.SmsSendJob.ctr').outE().inV()

graph.traversal().V('org.smssecure.smssecure.sms.MessageSender.sendTextMessage').outE().inV().hasId('org.smssecure.smssecure.jobs.SmsSendJob.ctr').outE().inV().hasId('org.smssecure.smssecure.jobs.SmsSendJob').outE().inV().hasId('android.telephony.SmsManager.sendMultipartTextMessage')

graph.traversal().V('org.smssecure.smssecure.jobs.SmsSendJob.deliver').outE().inV().hasId('android.telephony.SmsManager.sendMultipartTextMessage')