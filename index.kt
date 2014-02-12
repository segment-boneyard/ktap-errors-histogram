var errdesc = {
  [1] = "Operation not permitted",    #EPERM
  [2] = "No such file or directory",    #ENOENT
  [3] = "No such process",      #ESRCH
  [4] = "Interrupted system call",    #EINRT
  [5] = "I/O error",        #EIO
  [6] = "No such device or address",    #ENXIO
  [7] = "Argument list too long",     #E2BIG
  [8] = "Exec format error",      #ENOEXEC
  [9] = "Bad file number",      #EBADF
  [10] = "No child processes",      #ECHILD
  [11] = "Try again",       #EAGAIN
  [12] = "Out of memory",       #ENOMEM
  [13] = "Permission denied",     #EACCES
  [14] = "Bad address",       #EFAULT
  [15] = "Block device required",     #ENOTBLK
  [16] = "Device or resource busy",   #EBUSY
  [17] = "File exists",       #EEXIST
  [18] = "Cross-device link",     #EXDEV
  [19] = "No such device",      #ENODEV
  [20] = "Not a directory",     #ENOTDIR
  [21] = "Is a directory",      #EISDIR
  [22] = "Invalid argument",      #EINVAL
  [23] = "File table overflow",     #ENFILE
  [24] = "Too many open files",     #EMFILE
  [25] = "Not a typewriter",      #ENOTTY
  [26] = "Text file busy",      #ETXTBSY
  [27] = "File too large",      #EFBIG
  [28] = "No space left on device",   #ENOSPC
  [29] = "Illegal seek",        #ESPIPE
  [30] = "Read-only file system",     #EROFS
  [31] = "Too many links",      #EMLINK
  [32] = "Broken pipe",       #EPIPE
  [33] = "Math argument out of domain of func", #EDOM
  [34] = "Math result not representable",   #ERANGE

  [35] = "Resource deadlock would occur",   #EDEADLK
  [36] = "File name too long",      #ENAMETOOLONG
  [37] = "No record locks available",   #ENOLCK
  [38] = "Function not implemented",    #ENOSYS
  [39] = "Directory not empty",     #ENOTEMPTY
  [40] = "Too many symbolic links encountered", #ELOOP
  [42] = "No message of desired type",    #ENOMSG
  [43] = "Identifier removed",      #EIDRM
  [44] = "Channel number out of range",   #ECHRNG
  [45] = "Level 2 not synchronized",    #EL2NSYNC
  [46] = "Level 3 halted",      #EL3HLT
  [47] = "Level 3 reset",       #EL3RST
  [48] = "Link number out of range",    #ELNRNG
  [49] = "Protocol driver not attached",    #EUNATCH
  [50] = "No CSI structure available",    #ENOCSI
  [51] = "Level 2 halted",      #EL2HLT
  [52] = "Invalid exchange",      #EBADE
  [53] = "Invalid request descriptor",    #EBADR
  [54] = "Exchange full",       #EXFULL
  [55] = "No anode",        #ENOANO
  [56] = "Invalid request code",      #EBADRQC
  [57] = "Invalid slot",        #EBADSLT

  [59] = "Bad font file format",      #EBFONT
  [60] = "Device not a stream",     #ENOSTR
  [61] = "No data available",     #ENODATA
  [62] = "Timer expired",       #ETIME
  [63] = "Out of streams resources",    #ENOSR
  [64] = "Machine is not on the network",   #ENONET
  [65] = "Package not installed",     #ENOPKG
  [66] = "Object is remote",      #EREMOTE
  [67] = "Link has been severed",     #ENOLINK
  [68] = "Advertise error",     #EADV
  [69] = "Srmount error",       #ESRMNT
  [70] = "Communication error on send",   #ECOMM
  [71] = "Protocol error",      #EPROTO
  [72] = "Multihop attempted",      #EMULTIHOP
  [73] = "RFS specific error",      #EDOTDOT
  [74] = "Not a data message",      #EBADMSG
  [75] = "Value too large for defined data type", #EOVERFLOW
  [76] = "Name not unique on network",    #ENOTUNIQ
  [77] = "File descriptor in bad state",    #EBADFD
  [78] = "Remote address changed",    #EREMCHG
  [79] = "Can not access a needed shared library", #ELIBACC
  [80] = "Accessing a corrupted shared library",  #ELIBBAD
  [81] = ".lib section in a.out corrupted", #ELIBSCN
  [82] = "Attempting to link in too many shared libraries", #ELIBMAX
  [83] = "Cannot exec a shared library directly", #ELIBEXEC
  [84] = "Illegal byte sequence",     #EILSEQ
  [85] = "Interrupted system call should be restarted", #ERESTART
  [86] = "Streams pipe error",      #ESTRPIPE
  [87] = "Too many users",      #EUSERS
  [88] = "Socket operation on non-socket",  #ENOTSOCK
  [89] = "Destination address required",    #EDESTADDRREQ
  [90] = "Message too long",      #EMSGSIZE
  [91] = "Protocol wrong type for socket",  #EPROTOTYPE
  [92] = "Protocol not available",    #ENOPROTOOPT
  [93] = "Protocol not supported",    #EPROTONOSUPPORT
  [94] = "Socket type not supported",   #ESOCKTNOSUPPORT
  [95] = "Operation not supported on transport endpoint", #EOPNOTSUPP
  [96] = "Protocol family not supported",   #EPFNOSUPPORT
  [97] = "Address family not supported by protocol", #EAFNOSUPPORT
  [98] = "Address already in use",    #EADDRINUSE
  [99] = "Cannot assign requested address", #EADDRNOTAVAIL
  [100] = "Network is down",      #ENETDOWN
  [101] = "Network is unreachable",   #ENETUNREACH
  [102] = "Network dropped connection because of reset",  #ENETRESET
  [103] = "Software caused connection abort", #ECONNABORTED
  [104] = "Connection reset by peer",   #ECONNRESET
  [105] = "No buffer space available",    #ENOBUFS
  [106] = "Transport endpoint is already connected", #EISCONN
  [107] = "Transport endpoint is not connected",  #ENOTCONN
  [108] = " Cannot send after transport endpoint shutdown", #ESHUTDOWN
  [109] = "Too many references: cannot splice", #ETOOMANYREFS
  [110] = "Connection timed out",     #ETIMEDOUT
  [111] = "Connection refused",     #ECONNREFUSED
  [112] = "Host is down",       #EHOSTDOWN
  [113] = "No route to host",     #EHOSTUNREACH
  [114] = "Operation already in progress",  #EALREADY
  [115] = "Operation now in progress",    #EINPROGRESS
  [116] = "Stale NFS file handle",    #ESTALE
  [117] = "Structure needs cleaning",   #EUCLEAN
  [118] = "Not a XENIX named type file",    #ENOTNAM
  [119] = "No XENIX semaphores available",  #ENAVAIL
  [120] = "Is a named type file",     #EISNAM
  [121] = "Remote I/O error",     #EREMOTEIO
  [122] = "Quota exceeded",     #EDQUOT
  [123] = "No medium found",      #ENOMEDIUM
  [124] = "Wrong medium type",      #EMEDIUMTYPE
  [125] = "Operation Canceled",     #ECANCELED
  [126] = "Required key not available",   #ENOKEY
  [127] = "Key has expired",      #EKEYEXPIRED
  [128] = "Key has been revoked",     #EKEYREVOKED
  [129] = "Key was rejected by service",    #EKEYREJECTED
  [130] = "Owner died",       #EOWNERDEAD
  [131] = "State not recoverable",    #ENOTRECOVERABLE
}

var s = ptable()

trace syscalls:sys_exit_* {
  if (arg2 < 0) {
    var errno = -arg2
    s[errdesc[errno]] <<< 1
  }
}

trace_end {
  histogram(s)
  printf("\n")
}