# TODO refactoing
def plural(n)
	"bottle"+(n==1&&''||'s')
end
def word(n)
	(n==1&&"it"||"one")
end
def beer(n,is_first,start_at)
	if n<0 then
		return
	elsif n==0 then
		return "no more bottles of beer on the wall.\n\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, #{start_at} bottles of beer on the wall."
	else
		pl = plural(n)
		wd = word(n)
		if is_first then
			start_at = n
			return "#{n} #{pl} of beer on the wall, #{n} #{pl} of beer.\nTake #{wd} down and pass it around, "+beer(n-1,false,start_at)
		else
			return "#{n} #{pl} of beer on the wall.\n\n#{n} #{pl} of beer on the wall, #{n} #{pl} of beer.\nTake #{wd} down and pass it around, "+beer(n-1,false,start_at)
		end
	end
end

puts beer(99,true,-1)

sleep(20)