(function($) {
	"use strict";
	// Contact form valitation with jquery.validate plugin
	if ($.fn.validate) {
        var contactForm = $('#contact-form'),
            formBtn = contactForm.find('.btn');

        contactForm.validate({
            rules: {
                contactname: 'required',
                contacttel: {
                	required: true,
                	maxlength: 16
                },
                contactemail: {
                    required: true,
                    email: true
                },
                contactmessage: {
                    required: true
                }
            },
            messages: {
                contactname: "이름을 입력하세요.",
                contacttel: {
                	required: "전화번호를 입력하세요.",
                	maxlength: "잘못된 전화번호 형식입니다."
                },
                contactemail: {
                    required: "이메일주소를 입력하세요.",
                    email: "잘못된 이메일 형식입니다."
                },
                contactmessage: {
                    required: "문의내용을 작성해주세요"
                }
            },
            submitHandler: function (form) {
                $(document).ajaxStart(function() {
                    formBtn.button('loading');
                }).ajaxStop(function() {
                    formBtn.button('reset');
                });
                /* Ajax handler */
                $.ajax({
					type: 'post',
					url: 'assets/php/mail.php',
					data: $(form).serialize(),
				}).done(function( data ) {
					if ( data == 'success') {
						alert('Email has been sent successfully!')
					} else if ( data == 'already') {
						alert('You already sent a message. Please try again later');
					} else {
						alert('There is an error please try again later!');
					}
				}).error(function() {
					alert( 'There is an error please try again later!' );
				});
                return false;
            }
        });
    }
})(jQuery);