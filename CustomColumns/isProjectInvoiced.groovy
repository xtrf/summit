def project = unwrappedThis
def tasks = project.getTasks()

def textNotInvoiced = '<p style="color:red"><b>Project is not invoiced!</b></p>'
def textInvoiced = '<p style="color:green"><b>Project is fully invoiced.</b></p>'


boolean fullyInvoiced = {if(tasks.collect { it.isInvoiced() }.contains(false)) return false else true}()
fullyInvoiced ? textInvoiced : textNotInvoiced
